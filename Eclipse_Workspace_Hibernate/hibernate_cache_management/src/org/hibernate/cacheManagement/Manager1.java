package org.hibernate.cacheManagement;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class Manager1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		
		Person person = (Person) session.load(Person.class, 1);
		System.out.println(person);
		
		
		Person person1 = (Person) session.load(Person.class, 1);
		System.out.println(person1);
		
		//******************8	*********************************	*****************//
		
		System.out.println("----------------------------------");
		System.out.println("----------------------------------");
		
		Session session1 = new Configuration().configure().buildSessionFactory().openSession();
		Person person2 = (Person) session1.load(Person.class, 1);
		System.out.println(person2);
		
		Person person3 = (Person) session1.load(Person.class, 1);
		System.out.println(person3);
		
		System.out.println("Done");
	}

}
