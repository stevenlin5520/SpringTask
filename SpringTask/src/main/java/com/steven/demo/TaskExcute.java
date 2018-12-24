package com.steven.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TaskExcute {

	public static void main(String[] args) {
		  ApplicationContext context=new ClassPathXmlApplicationContext("classpath:/spring.xml");
	}
}
