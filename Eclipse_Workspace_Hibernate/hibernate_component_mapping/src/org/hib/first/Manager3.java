package org.hib.first;

import org.hibernate.Session;

public class Manager3 {

	public static void main(String[] args) {

		Session session = Util.getSession();
		Person person = (Person)session.load(Person.class, 2);
		session.beginTransaction();
		session.delete(person);
		session.getTransaction().commit();
		
		System.out.println("Done");
		
	}

}
