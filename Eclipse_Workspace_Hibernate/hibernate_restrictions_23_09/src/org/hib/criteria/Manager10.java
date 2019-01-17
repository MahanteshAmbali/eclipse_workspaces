package org.hib.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class Manager10 {

	public static void main(String[] args) {

		Session s1 = Util.getSession();
		Criteria ctr = s1.createCriteria(Person.class);
		Criterion c1 = Restrictions.eq("personFirstName", "Sagar");
		Criterion c2 = Restrictions.gt("personSalary", 40000);
		Criterion c3 = Restrictions.and(c1, c2);
		
		Criterion c4 = Restrictions.eq("personAddress", "BTM");
		Criterion c5 = Restrictions.eq("personFirstName", "Mahantesh");
		Criterion c6 = Restrictions.and(c4, c5);
		
		Criterion c7 = Restrictions.or(c3, c6);
		ctr.add(c7);
		List<Person> list = ctr.list();
		for (Person person : list) {
			System.out.println(person);
		}
		
		System.out.println("Done");
	}

}
