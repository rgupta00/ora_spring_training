package com.orderapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.orderapp.dto.Customer;

@Service
public class CustomerService {

	@Autowired
	private RestTemplate restTemplate;
	
	public Customer getCustomer(int customerId) {
		Customer customer=restTemplate
				.getForObject("http://CUSTOMER-APP/customerapp/customers/"+customerId, Customer.class);
		return customer;
	}

	
}
