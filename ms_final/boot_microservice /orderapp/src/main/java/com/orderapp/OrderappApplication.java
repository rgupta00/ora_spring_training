package com.orderapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
@EnableEurekaClient
@SpringBootApplication
public class OrderappApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderappApplication.class, args);
	}

	//We wnat that orderapp should communicate to other ms... for that we have to use restTemplate
	@LoadBalanced
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
