package org.hib.first;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class Manager6 {

	public static void main(String[] args) {

		Session session = Util.getSession();
		Criteria ctr= session.createCriteria(Person.class);
		ctr.add(Restrictions.eq("address.city", "Bangalore"));
		List<Person> list = ctr.list();
		for(Person person : list){
			System.out.println(person);
		}
	}

}
