package org.eightyoctane.cfbackgroundprocesses.base;

import org.eightyoctane.cfbackgroundprocesses.ExampleService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Base {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/app-context.xml");

		ExampleService exampleService = (ExampleService) context.getBean("exampleService");

		System.out.println(exampleService.getMessage());
	}
}
