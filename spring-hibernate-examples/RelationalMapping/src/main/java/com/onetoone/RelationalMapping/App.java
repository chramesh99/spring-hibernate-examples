package com.onetoone.RelationalMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
    	
    	ProductDetails productDetails = new ProductDetails();
    	productDetails.setProductId(1001);
    	productDetails.setPartNumber("oneplus");
    	productDetails.setOrigin("china");
    	
    	
    	Product product = new Product();
    	product.setProductId(101);
    	product.setName("phone");
    	product.setDescription("oneplus10pro");
    	product.setPrice(65000);
    	product.setProductDetails(productDetails);
    	
    	productDetails.setProduct(product);
    	
    	Configuration conf = new Configuration().configure();
    	SessionFactory sf = conf.buildSessionFactory();
    	Session session = sf.openSession();
    	Transaction tx = session.beginTransaction();
    	session.save(product);
    	session.save(productDetails);
    	tx.commit();
    	sf.close();
    	
    }
}
