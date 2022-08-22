package com.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Configuration
@ConfigurationProperties("spring.jdbc")
@Data
public class DbConfig {
	String driver;
	String username;
	String password;
	String url;
}
