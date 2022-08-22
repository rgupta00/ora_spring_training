package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApi {

	@Value("${hello.message}")
	private String hello;
	
	@Value("${hello.mykey}")
	private String mykey;
	
	@Autowired
	private DbConfig dbConfig;
	
	@GetMapping("getcon")
	public DbConfig getConn() {
		return dbConfig;
	}
	
	
	@GetMapping("checkurl")
	public String helloUrl() {
		return hello+": "+ mykey;
	}
	
}
