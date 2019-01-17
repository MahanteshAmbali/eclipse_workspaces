package com.lara.actions;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.lara.beans.Person;

public class Manager1 
{
	public static void main(String[] args) 
	{
		Configuration cfg =new Configuration();
		cfg.configure();
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session s1 = sf.openSession();
		
		Person p1 = new Person();
		p1.setFirstName("Dell");
		p1.setLastName("Sony");
		p1.setAge(29);
		p1.setWeight(81);
		p1.setId(1);
		
		s1.beginTransaction();
		s1.flush();
		s1.close();
		
		System.out.println("Done");
	}	
}
