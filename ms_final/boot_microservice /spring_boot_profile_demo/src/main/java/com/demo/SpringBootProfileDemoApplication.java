package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
@ConfigurationPropertiesScan("com.demo")
@SpringBootApplication
public class SpringBootProfileDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProfileDemoApplication.class, args);
	}

}
