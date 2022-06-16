package com.springfirstexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
    public static void main( String[] args ){
//    	Airtel airtel = new Airtel();
//    	airtel.calling();
//    	airtel.data();
//    	Sim sim = new Idea();//creating object using interface
//    	sim.calling();
//    	sim.data();
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/springfirstexample/applicationContext.xml");
    	System.out.println("xml file loaded....");
//    	Airtel air = (Airtel) context.getBean("airtel");
//    	air.calling();
//    	air.data();
    	Sim sim = context.getBean("sim",Sim.class);
    	sim.calling();
    	sim.data();
    	
    }
}
