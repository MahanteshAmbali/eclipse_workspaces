package com.lara;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Manager {

	public static void main(String[] args)
	{
		Employee emp = new Employee();		
		emp.setid(6);
		emp.setFirstName("Soumya");
		emp.setLastName("Dell");
		emp.setAddress("Bgm");
		emp.setSalary(20000);
		
		Configuration config = new Configuration();
		config.configure();
		
		SessionFactory sessionFactory = config.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		System.out.println("Session opened");
		
		session.beginTransaction();
		session.save(emp);
		session.getTransaction().commit();
		
		session.flush();
		session.clear();
		
		System.out.println("Done");
	}

}
