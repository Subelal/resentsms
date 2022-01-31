package com.coupon.resent.resentsms.repository;

import com.coupon.resent.resentsms.entity.ARVcoupondata;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ARVcoupondataRepository extends JpaRepository<ARVcoupondata, Long> {

    List<ARVcoupondata> findByDelivered(int delivered);
}
