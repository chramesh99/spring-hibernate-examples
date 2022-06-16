package com.springdependencyinjectionexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springdependencyinjectionexample/beans.xml");
		System.out.println("beans.xml is loaded");
		Student student = context.getBean("Student", Student.class);
		student.activateCheat();
	}
}
