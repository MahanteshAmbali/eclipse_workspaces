package com.lara.beans;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Manager1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person1 = new Person();
		
		person1.setFirstName("Dell");
		person1.setId(101);
	
		Configuration config = new Configuration();
		config.configure();
		SessionFactory factory = config.buildSessionFactory();
		
		Session session = factory.openSession();
		System.out.println("session open");
		
		session.beginTransaction();
		session.save(person1);
		session.getTransaction().commit();
		
		session.flush();
		session.close();
		
		System.out.println("Table created and Data Inserted");
		
	}

}
