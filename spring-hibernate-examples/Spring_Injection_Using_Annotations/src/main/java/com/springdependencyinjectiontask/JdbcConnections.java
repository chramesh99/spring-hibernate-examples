package com.springdependencyinjectiontask;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.beans.factory.annotation.Value;

public class JdbcConnections {
	@Value("${url}")
	private String url;
	private String userName;
	private String password;
	private String driver;
	
	
//	@Value("${userName}")
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Value("${password}")
	public void setPassword(String password) {
		this.password = password;
	}
	@Value("${driver}")
	public void setDriver(String driver) {
		this.driver = driver;
	}
	
	public void displayInfo() {
		System.out.println("url: " + url);
		System.out.println("userName: " + userName);
		System.out.println("password: " + password);
		System.out.println("driver: " + driver);
	}
	
	public void getConnection() throws Exception {
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, userName, password);
		System.out.println("connection sucessful:" + con);
	}
}
