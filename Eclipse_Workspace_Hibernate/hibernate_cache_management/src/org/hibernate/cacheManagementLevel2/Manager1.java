package org.hibernate.cacheManagementLevel2;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class Manager1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		
		Person1 person = (Person1) session.load(Person1.class, 1);
		System.out.println(person);
		
		
		Person1 person1 = (Person1) session.load(Person1.class, 1);
		System.out.println(person1);
		
		//******************8	*********************************	*****************//
		
		System.out.println("----------------------------------");
		System.out.println("----------------------------------");
		
		Session session1 = new Configuration().configure().buildSessionFactory().openSession();
		Person1 person2 = (Person1) session1.load(Person1.class, 1);
		System.out.println(person2);
		
		Person1 person3 = (Person1) session1.load(Person1.class, 1);
		System.out.println(person3);
		
		System.out.println("Done");
	}

}
