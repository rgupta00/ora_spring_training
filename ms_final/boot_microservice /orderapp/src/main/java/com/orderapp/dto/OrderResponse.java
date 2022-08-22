package com.orderapp.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderResponse {
	private String orderId;
	private Customer customer;
	private Product product;
	private BigDecimal totalPrice;
	private LocalDate date;
}
