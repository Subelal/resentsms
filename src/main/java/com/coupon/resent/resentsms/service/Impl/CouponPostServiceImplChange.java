package com.coupon.resent.resentsms.service.Impl;

import com.coupon.resent.resentsms.common.CommonConstants;
import com.coupon.resent.resentsms.entity.ARVcoupondata;
import com.coupon.resent.resentsms.feign.client.PaytmFeignClient;
import com.coupon.resent.resentsms.model.SmsRequest;
import com.coupon.resent.resentsms.model.SmsRequestChange;
import com.coupon.resent.resentsms.model.SmsResponse;
import com.coupon.resent.resentsms.model.SmsResponseChange;
import com.coupon.resent.resentsms.repository.ARVcoupondataRepository;
import com.coupon.resent.resentsms.service.CouponPostService;
import com.coupon.resent.resentsms.service.CouponPostServiceChange;
import com.coupon.resent.resentsms.validation.DataValidatior;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;
//@Service
public class CouponPostServiceImplChange// implements CouponPostServiceChange
{
//    private final Logger logger = LoggerFactory.getLogger(this.getClass());
//
//    @Autowired
//    Environment env;
//
//    @Autowired
//    private PaytmFeignClient paytmFeignClient;
//
//    @Autowired
//    JdbcTemplate jdbcTemplate;
//
//    @Autowired
//    private DataValidatior mobileNumberValidation;
//    @Autowired
//    private ARVcoupondataRepository arVcoupondatarRepository;
//
//
//    public Logger getLogger() {
//        return logger;
//    }
//
//
//
//
//
//
//    @Override
//    public void reSentSmsChange() throws Exception {
//
//        List<ARVcoupondata> listOfReSentSms = arVcoupondatarRepository.findByDelivered(0);
//        for(ARVcoupondata resmscust:listOfReSentSms){
//            getLogger().info("Start Resent Campaign");
//            if(!DataValidatior.isValidMobileNo(resmscust.getMobileNo())){
//                resmscust.setStatus("Invalid Mobile No");
//
//            }else{
//
//                SmsRequestChange smsRequest = null;
//                if (CommonConstants.brandUspa.equalsIgnoreCase(resmscust.getId().getBrand())) {
//                    if(resmscust.getGross_amt()>=CommonConstants.Slab2){
//                        smsRequest = new SmsRequestChange();
//                        smsRequest.setPe_id(env.getProperty("peId.uspa"));
//                        smsRequest.setFrom(env.getProperty("senderId.uspa"));
//                        smsRequest.setTemplate_id(env.getProperty("templateId.uspa.resent.in"));
//
//                        String messageContent = env.getProperty("message.template.resent.uspa")
//                                .replaceAll("couponCode", resmscust.getCouponCode())
//                                .replaceAll("giftName", CommonConstants.gift_jbl_in_hp)
//                                .replaceAll("redeemUrl",env.getProperty("url.jbl.in.earphone") )
//                                .replaceAll("endDate", env.getProperty("uspa.campaign.end.date"));
//                        smsRequest.setContent(messageContent);
//                        smsRequest.setReceiver(resmscust.getMobileNo());
//
//                        getLogger().info("SMS Request "+smsRequest.toString());
//                        getLogger().info("Resent Messsage :{}",messageContent);
//                        getLogger().info("Gross Amt :{} "+resmscust.getGross_amt()+" Coupon Code :{1}"+resmscust.getCouponCode()+" Mobile No :{2}"+resmscust.getMobileNo());
//
//                    }else if(resmscust.getGross_amt()>=CommonConstants.Slab1
//                            && resmscust.getGross_amt()< CommonConstants.Slab2){
//                        smsRequest = new SmsRequestChange();
//                        smsRequest.setPe_id(env.getProperty("peId.uspa"));
//                        smsRequest.setFrom(env.getProperty("senderId.uspa"));
//                        smsRequest.setTemplate_id(env.getProperty("templateId.uspa.resent.on"));
//
//                        String messageContent = env.getProperty("message.template.resent.uspa")
//                                .replaceAll("couponCode", resmscust.getCouponCode())
//                                .replaceAll("giftName", CommonConstants.gift_jbl_on_hp)
//                                .replaceAll("redeemUrl",env.getProperty("url.jbl.on.earphone") )
//                                .replaceAll("endDate", env.getProperty("uspa.campaign.end.date"));
//                        smsRequest.setContent(messageContent);
//                        smsRequest.setReceiver(resmscust.getMobileNo());
//                        getLogger().info("SMS Request "+smsRequest.toString());
//                        getLogger().info("Resent Messsage :{}",messageContent);
//                        getLogger().info("Gross Amt :{} "+resmscust.getGross_amt()+" Coupon Code :{1}"+resmscust.getCouponCode()+" Mobile No :{2}"+resmscust.getMobileNo());
//                    }
//                } else if (CommonConstants.brandFyingMachine.equalsIgnoreCase(resmscust.getId().getBrand())) {
//                    if(resmscust.getGross_amt()>=CommonConstants.Slab1){
//                        smsRequest = new SmsRequestChange();
//                        smsRequest.setPe_id(env.getProperty("peId.fm"));
//                        smsRequest.setFrom(env.getProperty("senderId.fm"));
//                        smsRequest.setTemplate_id(env.getProperty("templateId.resent.fm"));
//                        String messageContent = env.getProperty("message.template.resent.fm")
//                                .replaceAll("couponCode", resmscust.getCouponCode())
//                                .replaceAll("giftName", CommonConstants.gift_boat_sw)
//                                .replaceAll("redeemUrl", env.getProperty("url.boat.smartwatch"))
//                                .replaceAll("endDate", env.getProperty("fm.campaign.end.date"));
//                        smsRequest.setContent(messageContent);
//                        smsRequest.setReceiver(resmscust.getMobileNo());
//                        getLogger().info(" SMS Request Content:{} ",messageContent);
//                        getLogger().info("SMS Request "+smsRequest.toString());
//                        getLogger().info("Resent Messsage :{}",messageContent);
//                        getLogger().info("Gross Amt :{} "+resmscust.getGross_amt()+" Coupon Code :{1}"+resmscust.getCouponCode()+" Mobile No :{2}"+resmscust.getMobileNo());
//                    }
//                }
//
//                ObjectMapper mapper = new ObjectMapper();
//                if(null != smsRequest){
//                    try{
//                        waitForSmsSend(5000);
//                        String smsResponseString = sendSmsToCustomer(smsRequest);
//                        getLogger().info("Response from paytm feign client", smsResponseString);
//                        SmsResponseChange smsResponse = mapper.readValue(smsResponseString, SmsResponseChange.class);
//                        getLogger().info(" SMS Response Status "+smsResponse.getHttp_code());
//                        getLogger().info(" SMS Response msgId "+smsResponse.getMessage_id());
//                        if(null != smsResponse &&
//                                smsResponse.getHttp_code().equalsIgnoreCase("202")){
//                            getLogger().info(" Sms Response : ",smsResponse.getResponse());
//                            if(null!= smsResponse && smsResponse.getHttp_code().equalsIgnoreCase("202")){
//                                resmscust.setDelivered(1);
//                                resmscust.setSmsMessage(smsRequest.getContent());
//                                resmscust.setCouponApplyDate(new Date(System.currentTimeMillis()));
//                                arVcoupondatarRepository.save(resmscust);
//
//                            }
//                        }
//                    }catch (Exception ex){
//                        logger.error(ex.getMessage(), ex);
//                        resmscust.setSmsMessage(ex.getMessage());
//                        arVcoupondatarRepository.save(resmscust);
//                    }
//                }
//
//
//            }
//            getLogger().info("End Resent Campaign");
//        }
//
//
//
//    }
//    private String sendSmsToCustomer(SmsRequestChange smsRequest) throws  Exception{
//        getLogger().error(" SMS Request by sendSmsToCustomer :{}",smsRequest.toString());
//        return paytmFeignClient.sendSmsByPaytm(env.getProperty("paytm.bulk.sms.api.username.change"),
//                env.getProperty("paytm.bulk.sms.api.password.change"),
//                "1",
//                smsRequest.toString());
//
//    }
//    private void waitForSmsSend(int ms){
//        try {
//            Thread.sleep(ms);
//        } catch (InterruptedException e) {
//            System.err.format("IOException: %s%n", e);
//        }
//    }
}