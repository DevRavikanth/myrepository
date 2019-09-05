package com.ydr.playjava;


import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class PlayJavaApp {

	public static void main(String[] args) {
		System.out.println("Hello Playjava");
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		Session session = cfg.buildSessionFactory().openSession();
		Transaction trxn = session.beginTransaction();
		
		
		  Demo d = new Demo();
		  Demo d1 = new Demo(); 
		  
		  d.setDemoname("testdemo");
		  d.setDatanumber(1234);
		  session.save(d);
		  //System.out.println(d);
		  
		
		  d1.setDemoname("javaDemo"); d1.setDatanumber(12356); session.save(d1);
		  //session.merge(d1);
		 
		  
		 
		trxn.commit();
		session.close();
	}

}
