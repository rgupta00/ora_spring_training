package com.orderapp.service;

import java.time.LocalDateTime;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.orderapp.dto.Coupon;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class CouponService {

	
	private Logger logger=LoggerFactory.getLogger(CouponService.class);
	
	@Autowired
	private RestTemplate restTemplate;
	
	@CircuitBreaker(fallbackMethod = "fallbackcoupon", name = "couponservice")
	public Coupon getCoupon(String discountCoupon) {
		Coupon coupon=restTemplate.getForObject("http://COUPON-APP/couponapp/coupons/"+discountCoupon, Coupon.class);
		return coupon;
	}
	
	public Coupon fallbackcoupon(String discountCoupon, Exception exception) {
		
		logger.info("----------------------------"+ exception);
		
		return new Coupon(UUID.randomUUID().toString(), 5, "SUP05", LocalDateTime.now());
	}
}
