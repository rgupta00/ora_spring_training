package com.demo;

public class Foo {
	private String foo;

	public String getFoo() {
		return foo;
	}

	public void setFoo(String foo) {
		this.foo = foo;
	}
	
	public void print() {
		System.out.println("foo value is " + foo);
	}
}
