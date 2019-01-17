package org.hib.query;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class Manager1 {

	public static void main(String[] args) {

		Session s1 = Util.getSession();
		Query q1 = s1.createQuery("from Person");
		List<Person> list = q1.list();
		for (Person person : list) {
			System.out.println(person);
		}
	}

}
