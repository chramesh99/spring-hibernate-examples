package com.springdependencyinjection;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	@Value("${name}")
	private String name;
	@Value("${intrestedCourse}")
	private String intrestedCourse;
	@Value("${hobby}")
	private String hobby;

	public void displayStudentInfo() {
		System.out.println("Student name: " + name);
		System.out.println("Student intrestedCourse: " + intrestedCourse);
		System.out.println("Student hobby: " + hobby);
	}

}
