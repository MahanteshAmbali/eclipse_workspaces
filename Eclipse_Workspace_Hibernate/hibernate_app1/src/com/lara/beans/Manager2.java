package com.lara.beans;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Manager2 {

	public static void main(String[] args) {
		
		Book book1 = new Book();
		book1.setId(1);
		book1.setTitle("Core Java");
		book1.setAuthor("Ramesh Reddy");
		
		book1.setTitle("J2EE");
		book1.setAuthor("Ramesh Reddy");
		
		Configuration con = new Configuration();
		con.configure();
		
		SessionFactory sf = con.buildSessionFactory();
		
		Session s1 = sf.openSession();
		
		s1.beginTransaction();
		
		s1.save(book1);
		s1.getTransaction().commit();
		s1.flush();
		s1.close();
	}

}
