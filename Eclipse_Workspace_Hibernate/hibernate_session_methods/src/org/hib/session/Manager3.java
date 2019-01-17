package org.hib.session;

import org.hibernate.Session;

public class Manager3 {

	public static void main(String[] args) {

		Session s1 = Util.getSession();
		s1.beginTransaction();
		
		Person person = new Person();
		person.setpId(3);
		person.setfName("Updates");
		person.setlName("Value");
		
		s1.saveOrUpdate(person);
		s1.getTransaction().commit();
		
		
		System.out.println("Done");
	}

}
