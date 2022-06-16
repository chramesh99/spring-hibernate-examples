package com.onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	
	public static void main(String[] args) {
		
		Configuration config = new Configuration();
		config.configure();
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Category category = new Category(101, "computer");
		Category category1 = new Category(102, "smart_watches");
		Product pc = new Product(101, "Dell PC", "quad-core", 12000, category);
		Product laptop = new Product(102, "mac", "a1", 120, category);
		Product phone = new Product(103, "iphone", "13promax", 120000, category);
		Product smartWatches = new Product(104, "iwatchse", "with gps", 22000, category1);
		List<Product> products = new ArrayList<>();
		products.add(pc);
		products.add(laptop);
		products.add(phone);
		products.add(smartWatches);
		category.setProducts(products);
		session.save(category);
		session.save(category1);
		session.save(pc);
		session.save(laptop);
		session.save(phone);
		session.save(smartWatches);
		tx.commit();
		session.close();
	}
	
}
