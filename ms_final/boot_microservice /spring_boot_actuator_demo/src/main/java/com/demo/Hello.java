package com.demo;

import org.springframework.stereotype.Component;

@Component
public class Hello {
	private String hello;

	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}
	
	
}
