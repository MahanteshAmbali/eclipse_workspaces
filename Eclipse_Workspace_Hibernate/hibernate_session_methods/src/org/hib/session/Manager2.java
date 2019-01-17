package org.hib.session;

import org.hibernate.Session;

public class Manager2 {

	public static void main(String[] args) {

		Session s1 = Util.getSession();
		s1.beginTransaction();
		
		Person person = new Person();
		person.setpId(2);
		person.setfName("Java");
		person.setlName("Java");
		
		s1.persist(person);
		s1.getTransaction().commit();
		System.out.println("Done");
	}

}
