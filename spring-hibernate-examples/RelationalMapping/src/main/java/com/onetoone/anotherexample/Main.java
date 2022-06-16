package com.onetoone.anotherexample;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	
	public static void main(String[] args) {
		Laptop laptop = new Laptop();
		laptop.setLid(101);
		laptop.setLname("mac");
		Laptop laptop1 = new Laptop();
		laptop1.setLid(102);
		laptop1.setLname("windows");
		
		Student student = new Student();
		student.setId(1);
		student.setName("spidy");
		student.setMarks(88.8);
		List<Laptop > laptops = new ArrayList<>();
		laptops.add(laptop);
		laptops.add(laptop1);
		laptop.setStudent(student);
		laptop1.setStudent(student);
		Configuration config = new Configuration();
		config.configure();
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		session.save(student);
		session.save(laptop);
		session.save(laptop1);
		tr.commit();
		session.close();
	}
}
