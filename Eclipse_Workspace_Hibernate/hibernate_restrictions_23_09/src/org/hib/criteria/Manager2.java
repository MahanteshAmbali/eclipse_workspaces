package org.hib.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

public class Manager2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Session s1 = Util.getSession();
		
		Criteria ctr = s1.createCriteria(Person.class);
		List<Person> list = ctr.list();
		for (Person person : list) {
			System.out.println(person);
		}
	}

}
