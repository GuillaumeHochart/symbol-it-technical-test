package com.symbolIt.excuseDev.excuseDev.dto;

import java.io.Serializable;

public class Message implements Serializable {

    private String http_code;

    private String tag;

    private String message;

    public String getHttp_code() {
        return http_code;
    }

    public void setHttp_code(String http_code) {
        this.http_code = http_code;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
