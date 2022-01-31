package com.coupon.resent.resentsms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "arv_coupon_data_resent")
public class ARVcoupondata {
    @EmbeddedId
    private ARVcoupondataID Id;
    @Column(name = "GROSS_AMT")
    private long gross_amt;
    @Column(name = "TELIPHONE_NUMBER")
    private String mobileNo;
    @Column(name = "COUPON_CODE")
    private String couponCode;
    @Column(name = "STATUS")
    private String status;
    @Column(name = "sms_message")
    private String smsMessage;
    @Column(name = "coupon_apply_date", columnDefinition = "TIMESTAMP")
    private Date couponApplyDate;
    @Column(name="delivered", columnDefinition = "int default 0")
    private int delivered;

}
