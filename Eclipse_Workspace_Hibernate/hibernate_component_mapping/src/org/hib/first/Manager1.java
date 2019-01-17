package org.hib.first;

import org.hibernate.Session;

public class Manager1 {

	public static void main(String[] args) {

		Address address = new Address();
		address.setHouseNo("140/3");
		address.setStreetName("BTM 2nd Stage");
		address.setCity("Bangalore");
		address.setState("Karanataka");
		
		Person person = new Person();
		person.setPersonId(1);
		person.setPersonFirstName("Mahantesh");
		person.setPersonLastName("Ambali");
		person.setAddress(address);
		
		Session session = Util.getSession();
		session.beginTransaction();
		
		session.save(person);
		session.getTransaction().commit();
		
		session.flush();
		session.close();
		
		System.out.println("Done");
				
	}
}
