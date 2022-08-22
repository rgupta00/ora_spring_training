package com.customerapp.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.customerapp.repo.Customer;

@RestController
public class CustomerApi {
	
	@GetMapping(path = "customers/{id}")
	public Customer getById(@PathVariable(name="id")  int id) {
		return new Customer(id, "raj", "rgupta.mtech@gmail.com");
		
	}

}
