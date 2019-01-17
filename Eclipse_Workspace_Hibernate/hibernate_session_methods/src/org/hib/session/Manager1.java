package org.hib.session;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Manager1 {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session s1 = sf.openSession();
		s1.beginTransaction();
		
		Person person = new Person();
		person.setpId(1);
		person.setfName("Mahantesh");
		person.setlName("Dell");
		
		Integer obj = (Integer)s1.save(person);
		s1.getTransaction().commit();
		System.out.println(obj);
		
		System.out.println("Done");
		
	}

}
