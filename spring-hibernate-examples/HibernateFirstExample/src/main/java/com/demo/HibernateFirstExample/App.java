package com.demo.HibernateFirstExample;

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
    	Student add = new Student();
    	add.setsId(102);
    	add.setsName("rosy");
    	add.setsPhoneNumber(1234567890);
    	Configuration conf = new Configuration().configure();
    	SessionFactory sf = conf.buildSessionFactory();
    	Session session = sf.openSession();
    	Transaction tx = session.beginTransaction();
    	session.save(add);
    	tx.commit();
    	sf.close();
    	
    }
}
