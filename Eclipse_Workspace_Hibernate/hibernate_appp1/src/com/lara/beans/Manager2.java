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

		Book book2 = new Book();
		book2.setId(2);
		book2.setTitle("Advanced Java");
		book2.setAuthor("Durga");
		
		Book book3 = new Book();
		book3.setId(3);
		book3.setTitle("Github");
		book3.setAuthor("Veeresh");
		
		Book book4 = new Book();
		book4.setTitle("Maven");
		book4.setAuthor("Soumya");
		
		
		Configuration con = new Configuration();
		con.configure();
		
		SessionFactory sf = con.buildSessionFactory();
		
		Session s1 = sf.openSession();
		
		s1.beginTransaction();
		
		s1.save(book1);
		s1.save(book2);
		s1.save(book3);
		s1.save(book4);
		
		s1.getTransaction().commit();
		s1.flush();
		s1.close();
	}

}
