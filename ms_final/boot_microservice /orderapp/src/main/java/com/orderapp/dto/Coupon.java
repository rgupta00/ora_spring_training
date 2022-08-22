package com.orderapp.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Coupon {
	private String id;
	private int discountPercentage;
	private String couponCode;
	private LocalDateTime expTimeStamp;
	
	
}
