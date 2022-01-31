package com.coupon.resent.resentsms.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "errorCode",
        "status",
        "msg_id",
        "bulk_id"
})
public class SmsResponse {
    @JsonProperty("errorCode")
    private String errorCode;
    @JsonProperty("status")
    private String status;
    @JsonProperty("msg_id")
    private String msg_id;
    @JsonProperty("bulk_id")
    private String bulk_id;

    @JsonProperty("errorCode")
    public String getErrorCode() {
        return errorCode;
    }

    @JsonProperty("errorCode")
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("msg_id")
    public String getMsg_id() {
        return msg_id;
    }

    @JsonProperty("msg_id")
    public void setMsg_id(String msg_id) {
        this.msg_id = msg_id;
    }

    @JsonProperty("bulk_id")
    public String getBulk_id() {
        return bulk_id;
    }

    @JsonProperty("bulk_id")
    public void setBulk_id(String bulk_id) {
        this.bulk_id = bulk_id;
    }



}
