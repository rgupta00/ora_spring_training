package com.orderapp.api;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.orderapp.dto.Coupon;
import com.orderapp.dto.Customer;
import com.orderapp.dto.OrderRequest;
import com.orderapp.dto.OrderResponse;
import com.orderapp.dto.Product;

@RestController
public class OrderApi {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@PostMapping(path = "orders")
	public ResponseEntity<OrderResponse> bookOrder(@RequestBody  OrderRequest orderRequest) {
		
		//1. you need to get the customer details
		
		Customer customer=restTemplate
				.getForObject("http://localhost:8081/customerapp/customers/"+orderRequest.getCid(), Customer.class);
		
		//2. you need to get coupon details
		
		Coupon coupon=restTemplate
				.getForObject("http://localhost:8085/couponapp/coupons/"+orderRequest.getDiscountCoupon(), Coupon.class);
		
		
		//3. you need to get product details
		Product product=restTemplate
				.getForObject("http://localhost:8082/productapp/products/"+orderRequest.getPid(), Product.class);
		
		OrderResponse orderResponse=new OrderResponse();
		orderResponse.setOrderId(UUID.randomUUID().toString());
		orderResponse.setCustomer(customer);
		orderResponse.setProduct(product);
		
		orderResponse.setDate(LocalDate.now());
		
		BigDecimal discountedPrice= 
				product.getPrice().multiply(new BigDecimal(orderRequest.getQuantity()))
				.subtract(new BigDecimal(coupon.getDiscountPercentage()).multiply(new BigDecimal(orderRequest.getQuantity())));
		
		orderResponse.setTotalPrice(discountedPrice);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(orderResponse);
	}

}




