package com.springdependencyinjection.Spring_Annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springdependencyinjection/Spring_Annotations/beans.xml");
		College college = context.getBean("collegeBean", College.class);
		college.test();
		context.close();
		
	}
}
