package com.coupon.resent.resentsms.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({  "sender", "receiver", "content", "ref_id", "msg_type","req_time", "pe_id", "template_id" })

public class SmsRequestChange {
    @JsonProperty("sender")
    private String sender;
    @JsonProperty("receiver")
    private String receiver;
    @JsonProperty("content")
    private String content;
    @JsonProperty("ref_id")
    private String ref_id;
    @JsonProperty("msg_type")
    private String msg_type;
    @JsonProperty("req_time")
    private String req_time;



    @JsonProperty("req_time")
    public String getReq_time() {
        return req_time;
    }

    @JsonProperty("req_time")
    public void setReq_time(String req_time) {
        this.req_time = req_time;
    }

    @JsonProperty("pe_id")
    private String pe_id;
    @JsonProperty("template_id")
    private String template_id;


    @JsonProperty("sender")
    public String getSender() {
        return sender;
    }
    @JsonProperty("sender")
    public void setSender(String sender) {
        this.sender = sender;
    }

    @JsonProperty("receiver")
    public String getReceiver() {
        return receiver;
    }

    @JsonProperty("receiver")
    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }
    @JsonProperty("content")
    public String getContent() {
        return content;
    }
    @JsonProperty("content")
    public void setContent(String content) {
        this.content = content;
    }
    @JsonProperty("ref_id")
    public String getRef_id() {
        return ref_id;
    }
    @JsonProperty("ref_id")
    public void setRef_id(String ref_id) {
        this.ref_id = ref_id;
    }
    @JsonProperty("msg_type")
    public String getMsg_type() {
        return msg_type;
    }
    @JsonProperty("msg_type")
    public void setMsg_type(String msg_type) {
        this.msg_type = msg_type;
    }
    @JsonProperty("pe_id")
    public String getPe_id() {
        return pe_id;
    }
    @JsonProperty("pe_id")
    public void setPe_id(String pe_id) {
        this.pe_id = pe_id;
    }
    @JsonProperty("template_id")
    public String getTemplate_id() {
        return template_id;
    }
    @JsonProperty("template_id")
    public void setTemplate_id(String template_id) {
        this.template_id = template_id;
    }

    @Override
    public String toString() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return "[" + mapper.writeValueAsString(this) + "]";
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

}
