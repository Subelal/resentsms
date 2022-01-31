package com.coupon.resent.resentsms.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "from", "receiver", "content", "tag_name", "param1", "param2", "pe_id" })
public class SmsRequest {
    @JsonProperty("from")
    private String from;
    @JsonProperty("receiver")
    private String receiver;
    @JsonProperty("content")
    private String content;
    @JsonProperty("tag_name")
    private String tagName;
    @JsonProperty("param1")
    private Integer param1;
    @JsonProperty("param2")
    private String param2;
    @JsonProperty("pe_id")
    private String pe_id;
    @JsonProperty("template_id")
    private String template_id;


    @JsonProperty("from")
    public String getFrom() {
        return from;
    }

    @JsonProperty("from")
    public void setFrom(String from) {
        this.from = from;
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

    @JsonProperty("tag_name")
    public String getTagName() {
        return tagName;
    }

    @JsonProperty("tag_name")
    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    @JsonProperty("param1")
    public Integer getParam1() {
        return param1;
    }

    @JsonProperty("param1")
    public void setParam1(Integer param1) {
        this.param1 = param1;
    }

    @JsonProperty("param2")
    public String getParam2() {
        return param2;
    }

    @JsonProperty("param2")
    public void setParam2(String param2) {
        this.param2 = param2;
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
            return "[" + mapper.writeValueAsString(this) +"]";
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }


}
