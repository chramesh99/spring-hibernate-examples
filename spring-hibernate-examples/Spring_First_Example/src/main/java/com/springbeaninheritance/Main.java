package com.springbeaninheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springbeaninheritance/beans.xml");
		Customer customer = context.getBean("baseCustomer", Customer.class);
		System.out.println(customer.toString());
		Customer customerp = context.getBean("parentCustomer", Customer.class);
		System.out.println(customerp.toString());
	}
}
