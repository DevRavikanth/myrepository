package com.ydr.playjava;


import java.util.ArrayList;
import java.util.List;

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
		
		//one to many and many to one maping with out third table
		ProfessorsO2M p = new ProfessorsO2M();
		  p.setName("devravikanth");
		  
		  SubjectsM2O s = new SubjectsM2O(); 
		  s.setSubjectname("java");
		  
		  SubjectsM2O s1 = new SubjectsM2O(); 
		  s1.setSubjectname("lahari");
			
		  p.getSubjects().add(s);
		  p.getSubjects().add(s1);
			 
		 
		/*
		 * List<SubjectsM2O> al = new ArrayList<SubjectsM2O>(); al.add(s); al.add(s1);
		 * 
		 * p.setSubjects(al); p.getSubjects();
		 */
		  
		  s.setProf(p);
		  s1.setProf(p);
		  
		  session.save(p); 
		  session.save(s); 
		  session.save(s1);
		 
		
		
		
		/* one to many maping with third table
		 * Professors p = new Professors(); p.setName("devravikanth");
		 * 
		 * Subjects s = new Subjects(); s.setSubjectname("java");
		 * 
		 * Subjects s1 = new Subjects(); s1.setSubjectname("lahari");
		 * p.getSubjects().add(s); p.getSubjects().add(s1);
		 * 
		 * session.save(p); session.save(s); session.save(s1);
		 */
		
		
		/* one to one mapping
		 * Professor p = new Professor(); p.setName("DevRavikanth"); Subject s = new
		 * Subject(); s.setSubjectname("java"); p.setSubject(s);
		 *  session.save(p); 
		  	session.save(s);
		 */
		/////////////
		/*
		 * Demo d = new Demo(); Demo d1 = new Demo();
		 * 
		 * d.setDemoname("testdemo"); d.setDatanumber(1234); session.save(d);
		 * //System.out.println(d);
		 * 
		 * 
		 * d1.setDemoname("javaDemo"); d1.setDatanumber(12356); session.save(d1);
		 * //session.merge(d1);
		 */
		
		 
		 
		
		 
		trxn.commit();
		session.close();
	}

}
