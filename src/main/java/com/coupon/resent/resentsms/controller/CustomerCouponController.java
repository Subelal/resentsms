package com.coupon.resent.resentsms.controller;

import com.coupon.resent.resentsms.service.CouponPostService;
import com.coupon.resent.resentsms.service.CouponPostServiceChange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerCouponController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CouponPostService service;

//    @Autowired
//    private CouponPostServiceChange serviceChange;

        @GetMapping("/coupon/resentsms")
    public String processReSent() throws Exception{
        service.reSentSms();

        return "Resent SMS to Customer";
    }
   @GetMapping("/coupon/resentsmschange")
   private String processResentchange() throws Exception{
       service.reSentSmsChange();

            return "Resent Change Sms to customer";
   }
    @GetMapping("/hello")
    public String hello() {

        return "Hello Test for Resent";
    }

}
