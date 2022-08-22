package com.orderapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class OrderappApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderappApplication.class, args);
	}

	//We wnat that orderapp should communicate to other ms... for that we have to use restTemplate
	
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
