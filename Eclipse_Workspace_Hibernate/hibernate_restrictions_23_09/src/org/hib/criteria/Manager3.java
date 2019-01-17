package org.hib.criteria;

import java.util.List;

import org.hibernate.Session;

public class Manager3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Session s1 = Util.getSession();
		List<Person> list = s1.createCriteria(Person.class).list();
		for (Person person : list) {
			System.out.println(person);
		}
	}

}
