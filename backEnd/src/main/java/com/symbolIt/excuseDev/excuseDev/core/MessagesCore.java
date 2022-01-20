package com.symbolIt.excuseDev.excuseDev.core;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.symbolIt.excuseDev.excuseDev.dto.Message;
import com.symbolIt.excuseDev.excuseDev.exception.BusinessException;
import com.symbolIt.excuseDev.excuseDev.exception.NotFoundException;
import com.symbolIt.excuseDev.excuseDev.model.MessagesResolver;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class MessagesCore {

    @Autowired
    private MessagesResolver messages;

    @Autowired
    private ObjectMapper mapper;

    public List<Message> getMessages() throws BusinessException, NotFoundException {

        Message[] result=null;
        try {
            result=mapper.readValue(messages.getData().toString(),Message[].class);
        } catch (JsonProcessingException e) {
            throw new BusinessException("mapping errors");
        }
        if(result == null || result.length ==0) throw new NotFoundException("Not find messages");

        return Arrays.asList(result);
    }
    public List<Message> addMessage(Message message) throws BusinessException, NotFoundException {
        if(message == null) throw new IllegalArgumentException("messag is null");
        messages.add(new JSONObject(new Gson().toJson(message)));
        return getMessages();
    }
}
