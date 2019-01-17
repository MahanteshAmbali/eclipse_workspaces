package org.hib;

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
		
		Address address1 = new Address();
		address1.setHouseNo("14/3");
		address1.setStreetName("TM 2nd Stage");
		address1.setCity("Bangore");
		address1.setState("Karanataka");
		
		Person person1 = new Person();
		person1.setPersonId(3);
		person1.setPersonFirstName("Mahsafantesh");
		person1.setPersonLastName("Ambalsdafi");
		person1.setAddress(address1);
		
		Session session = Util.getSession();
		session.beginTransaction();
		
		session.save(person);
		session.save(person1);
		session.getTransaction().commit();
		
		session.flush();
		session.close();
		
		System.out.println("Done");
				
	}
}
