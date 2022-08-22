package com.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApi {

	
	@GetMapping("checkurl")
	public String helloUrl() {
		return "hello to actuator";
	}
	
}
