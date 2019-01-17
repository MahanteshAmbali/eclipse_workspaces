package org.hib.create;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Manager1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person();
		p1.setfName("Dell");
		p1.setlName("Hello");
		//p1.setPid(01);
		
		Configuration con = new Configuration();
		con.configure();
		
		SessionFactory sf = con.buildSessionFactory();
		Session s1 = sf.openSession();
		
		s1.beginTransaction();
		s1.save(p1);
		s1.getTransaction().commit();
		
		s1.flush();
		s1.close();
		
		System.out.println("Done");
	}

}
