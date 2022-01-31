package com.coupon.resent.resentsms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class ARVcoupondataID implements Serializable {
    @Column(name = "RTL_LOC_ID", nullable = false)
    private Long rtlLocId;
    @Column(name = "WKSTN_ID", nullable = false)
    private Long wkstnId;
    @Column(name = "TRANS_SEQ", nullable = false)
    private Long transSeq;
    @Column(name = "BRAND")
    private String brand;
    @Column(name = "BUSINESS_DATE", columnDefinition = "TIMESTAMP", nullable = false)
    private Date businessDate;

}
