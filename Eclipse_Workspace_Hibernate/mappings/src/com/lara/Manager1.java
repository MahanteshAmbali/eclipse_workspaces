package com.lara;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Manager1 {

	public static void main(String[] args) 
	{
		Configuration con=new Configuration();
		con.configure();
		SessionFactory sf=con.buildSessionFactory();
		Session s1=sf.openSession();
		/*
        Person p1=new Person();
		p1.setId(1);
		p1.setFirstName("subhah");
		p1.setLastName("khot");
		p1.setAge(26);
		
		Address a1=new Address();
		a1.setHouseNo(100);
		a1.setStreetName("btm");
		a1.setState("kar");
		p1.setAddress(a1);
		a1.setPerson(p1);
		
		s1.beginTransaction();
		s1.save(p1);
		s1.getTransaction().commit();
		s1.flush();
		s1.close();
		System.out.println("done");
		*/
		
	}

}
