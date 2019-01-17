package org.hib.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class Manager6 {

	public static void main(String[] args) {

		Session s1 = Util.getSession();
		Criteria ctr = s1.createCriteria(Person.class);
		Criterion c1 = Restrictions.between("personFirstName", "a", "z");
		ctr.add(c1);
		List<Person> list = ctr.list();
		for (Person person : list) {
			System.out.println(person);
		}
	}

}
