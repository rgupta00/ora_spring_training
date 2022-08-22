package com.couponapp.service;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.couponapp.repo.Coupon;

@Service
public class CouponServiceImpl implements CouponService {

	@Override
	public Coupon getCoupon(String code) {
		int discountPercentage = 0;

		if (code.equalsIgnoreCase("SUP05")) {
			discountPercentage = 5;
		} else if (code.equalsIgnoreCase("SUP10")) {
			discountPercentage = 10;
		} else if (code.equalsIgnoreCase("SUP15")) {
			discountPercentage = 15;
		} else {
			discountPercentage = 2;
		}
		//change the logic
		return new Coupon(UUID.randomUUID().toString(), discountPercentage, code, LocalDateTime.now());
	}

}
