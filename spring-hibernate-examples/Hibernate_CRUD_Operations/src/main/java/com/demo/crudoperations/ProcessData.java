package com.demo.crudoperations;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ProcessData {
	
	static Configuration config = new Configuration().configure();
	static SessionFactory sf = config.buildSessionFactory();
	
	public static void addStudent() {
		Scanner sc = new Scanner(System.in);
		StudentDetails std = new StudentDetails();
		System.out.println("enter the id:");
		int id = sc.nextInt();
		System.out.println("enter the name:");
		String name = sc.next();
		System.out.println("enter the address:");
		String address = sc.next();
		System.out.println("enter the phoneNumber:");
		long number = sc.nextLong();
		std.setsId(id);
		std.setsName(name);
		std.setsAddress(address);
		std.setsPhoneNumber(number);
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(std);
		tx.commit();
		session.close();
		System.out.println("data successfully added............");
	}
	public static void updateStudent() {
		Scanner sc = new Scanner(System.in);
		StudentDetails std = new StudentDetails();
		System.out.println("enter the id:");
		int id = sc.nextInt();
		System.out.println("enter the name:");
		String name = sc.next();
		System.out.println("enter the address:");
		String address = sc.next();
		System.out.println("enter the phoneNumber:");
		long number = sc.nextLong();
		std.setsId(id);
		std.setsName(name);
		std.setsAddress(address);
		std.setsPhoneNumber(number);
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.update(std);
		tx.commit();
		session.close();
		System.out.println("data successfully updated............");
	}
	public static void deleteStudent() {
		Scanner sc = new Scanner(System.in);
		StudentDetails std = new StudentDetails();
		System.out.println("enter the id:");
		int id = sc.nextInt();
//		System.out.println("enter the name:");
//		String name = sc.next();
//		System.out.println("enter the address:");
//		String address = sc.next();
//		System.out.println("enter the phoneNumber:");
//		long number = sc.nextLong();
		std.setsId(id);
//		std.setsName(name);
//		std.setsAddress(address);
//		std.setsPhoneNumber(number);
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.delete(std);
		tx.commit();
		session.close();
		System.out.println("data successfully deleted............");
	}
	
	public static void readStudent() {
		Session session = sf.openSession();
		Scanner sc = new Scanner(System.in);
		StudentDetails std = null;
		
		System.out.println("enter the id:");
		int id = sc.nextInt();
		std = session.get(StudentDetails.class, id);
//		std = session.load(StudentDetails.class, id);
		Transaction tx = session.beginTransaction();
		
		System.out.println("id:"+std.getsId());
		System.out.println("name:"+std.getsName());
		System.out.println("address:"+std.getsAddress());
		System.out.println("phonenumber:"+std.getsPhoneNumber());
		
		tx.commit();
		session.close();
		System.out.println("data successfully updated............");
	}
	
}
