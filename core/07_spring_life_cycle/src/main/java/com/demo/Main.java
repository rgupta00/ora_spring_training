package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {

		ApplicationContext ctx=new ClassPathXmlApplicationContext("demo.xml");
		
		Foo foo=(Foo) ctx.getBean("foo");
		foo.print();
	}

}





