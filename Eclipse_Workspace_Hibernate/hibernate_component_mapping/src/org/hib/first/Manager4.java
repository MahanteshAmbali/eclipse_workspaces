package org.hib.first;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

public class Manager4 {

	public static void main(String[] args) {

		Session session = Util.getSession();
		Criteria ctr = session.createCriteria(Person.class);
		List<Person> list = ctr.list();
		for (Person person : list) {
			System.out.println(person.getPersonId());
			System.out.println(person.getPersonFirstName());
			System.out.println(person.getPersonLastName());
			System.out.println(person.getAddress().getHouseNo());
			System.out.println(person.getAddress().getStreetName());
			System.out.println(person.getAddress().getCity());
			System.out.println(person.getAddress().getState());
		}
	}

}
