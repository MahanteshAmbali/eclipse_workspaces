package org.hib.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class Manager8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session s1 = Util.getSession();
		Criteria ctr = s1.createCriteria(Person.class);
		Criterion c1 = Restrictions.eq("personFirstName", "Mahantesh");
		Criterion c2 = Restrictions.eqOrIsNull("personSalary", null);
		ctr.add(c1);
		ctr.add(c2);
		List<Person> list = ctr.list();
		for (Person person : list) {
			System.out.println(person);
		}
	}

}
