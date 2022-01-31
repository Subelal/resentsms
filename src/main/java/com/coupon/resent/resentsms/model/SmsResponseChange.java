package com.coupon.resent.resentsms.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "STATUS_CODE",
        "DESCRIPTION",
        "RESPONSE",
        "MESSAGE_ID",
        "TIME"
})
public class SmsResponseChange {
    @JsonProperty("STATUS_CODE")
    private String STATUS_CODE;
    @JsonProperty("RESPONSE")
    private String RESPONSE;
    @JsonProperty("DESCRIPTION")
    private String DESCRIPTION;
    @JsonProperty("MESSAGE_ID")
    private String MESSAGE_ID;
    @JsonProperty("TIME")
    private String TIME;

    @JsonProperty("STATUS_CODE")
    public String getSTATUS_CODE() {
        return STATUS_CODE;
    }
    @JsonProperty("STATUS_CODE")
    public void setSTATUS_CODE(String STATUS_CODE) {
        this.STATUS_CODE = STATUS_CODE;
    }
    @JsonProperty("RESPONSE")
    public String getRESPONSE() {
        return RESPONSE;
    }
    @JsonProperty("RESPONSE")
    public void setRESPONSE(String RESPONSE) {
        this.RESPONSE = RESPONSE;
    }
    @JsonProperty("DESCRIPTION")
    public String getDESCRIPTION() {
        return DESCRIPTION;
    }
    @JsonProperty("DESCRIPTION")
    public void setDESCRIPTION(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }
    @JsonProperty("MESSAGE_ID")
    public String getMESSAGE_ID() {
        return MESSAGE_ID;
    }
    @JsonProperty("MESSAGE_ID")
    public void setMESSAGE_ID(String MESSAGE_ID) {
        this.MESSAGE_ID = MESSAGE_ID;
    }
    @JsonProperty("TIME")
    public String getTIME() {
        return TIME;
    }
    @JsonProperty("TIME")
    public void setTIME(String TIME) {
        this.TIME = TIME;
    }


}
