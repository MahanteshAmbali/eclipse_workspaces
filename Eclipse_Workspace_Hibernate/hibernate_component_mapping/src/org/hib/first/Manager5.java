package org.hib.first;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class Manager5 {

	public static void main(String[] args) {

		Session session = Util.getSession();
		Criteria ctr = session.createCriteria(Person.class);
		ctr.add(Restrictions.eq("personLastName", "DEll"));
		List list = ctr.list();
		for (String string : args) {
			System.out.println(string);
		}
	}

}
