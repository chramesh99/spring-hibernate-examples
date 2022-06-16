package com.springdependencyinjection.Spring_Annotations;

import org.springframework.stereotype.Component;

@Component("collegeBean")
public class College {

	public void test() {
		System.out.println("the test method is called..");
	}

}
