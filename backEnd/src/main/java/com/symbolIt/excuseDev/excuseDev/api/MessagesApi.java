package com.symbolIt.excuseDev.excuseDev.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.symbolIt.excuseDev.excuseDev.core.MessagesCore;
import com.symbolIt.excuseDev.excuseDev.dto.Message;
import com.symbolIt.excuseDev.excuseDev.exception.BusinessException;
import com.symbolIt.excuseDev.excuseDev.exception.NotFoundException;
import com.symbolIt.excuseDev.excuseDev.model.MessagesResolver;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class MessagesApi {

    @Autowired
    private MessagesResolver messages;

    @Autowired
    private MessagesCore messagesCore;

    @GetMapping("/excuses")
    @ResponseBody
    public List<Message> getMessages() throws BusinessException, NotFoundException {
        return messagesCore.getMessages();
    }

    @PostMapping(value = "/excuses", produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
    public JSONObject addMessage(@RequestBody JSONObject jsonObject){
        return messages.add(jsonObject);
    }
}
