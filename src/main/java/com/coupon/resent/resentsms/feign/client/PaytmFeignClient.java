package com.coupon.resent.resentsms.feign.client;

import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "paytm",
        url = "${paytm.bulk.sms.api.url}", configuration = PaytmFeignClientConfiguration.class)
public interface PaytmFeignClient {
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = "text/json; charset=utf-8")
    @Headers({"Content-Type: application/json;charset=UTF-8"})
    public String sendSmsByPaytm(@RequestHeader("username") String username,
                                 @RequestHeader("password") String password,
                                 @RequestHeader("Access-Token") String Access_Token,
                                 @RequestParam("msg_type") String msg_type,
                                 @RequestBody String paytmSmsRequest);

}