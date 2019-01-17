package org.hib.first;

import org.hibernate.Session;

public class Manager2 {

	public static void main(String[] args) {

		Session session = Util.getSession();
		Person person = (Person)session.load(Person.class, 1);
		person.setPersonFirstName("Sagar");
		person.setPersonLastName("DEll");
		
		Address address = person.getAddress();
		address.setHouseNo("Gokak");
		session.beginTransaction();
		session.save(person);
		session.getTransaction().commit();
		
		System.out.println("done");
	}

}
