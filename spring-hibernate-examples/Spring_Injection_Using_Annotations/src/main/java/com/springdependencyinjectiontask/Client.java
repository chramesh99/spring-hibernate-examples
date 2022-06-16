package com.springdependencyinjectiontask;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) throws Exception {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springdependencyinjectiontask/beans.xml");
		JdbcConnections jdbcConnection = context.getBean("jbdbcConnections", JdbcConnections.class);
		jdbcConnection.displayInfo();
		jdbcConnection.getConnection();
	}
}
