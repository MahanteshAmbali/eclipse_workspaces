package org.hib.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class Manager9 {

	public static void main(String[] args) {

		Session s1 = Util.getSession();
		Criteria ctr = s1.createCriteria(Person.class);
		Criterion c1 = Restrictions.eq("personFirstName", "Mahantesh");
		Criterion c2 = Restrictions.eq("personEducation", "BE");
		Criterion c3 = Restrictions.or(c1, c2);
		
		ctr.add(c3);
		List<Person> list = ctr.list();
		for (Person person : list) {
			System.out.println(person);
		}
		
		System.out.println("Done");
	}

}
