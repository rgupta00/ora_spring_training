package com.couponapp.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.couponapp.repo.Coupon;
import com.couponapp.service.CouponService;

@RestController
public class CouponApi {
	
	@Autowired
	private CouponService couponService;
	
	
	@GetMapping(path = "coupons/{code}")
	public Coupon getByCouponCode(@PathVariable(name = "code")  String couponCode) {
		return couponService.getCoupon(couponCode);
	}

}
