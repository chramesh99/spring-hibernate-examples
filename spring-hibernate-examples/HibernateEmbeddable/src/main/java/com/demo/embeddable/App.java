package com.demo.embeddable;

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
        
    	StudentName name = new StudentName();
    	name.setFname("java");
    	name.setMname("oka");
    	name.setLname("sun");
    	
    	Student student = new Student();
    	student.setId(101);
    	student.setCity("vijayawada");
    	student.setName(name);
    	
    	Configuration config = new Configuration().configure();

    	SessionFactory sessionFactory = config.buildSessionFactory();
    	Session session = sessionFactory.openSession();
    	Transaction tx = session.beginTransaction();
    	session.save(student);
    	tx.commit();
    	session.close();
    	
    }
}
