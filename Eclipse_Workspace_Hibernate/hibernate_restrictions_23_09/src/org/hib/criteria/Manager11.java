package org.hib.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;

public class Manager11 {

	public static void main(String[] args) {
		Session session = Util.getSession();
		Criteria ctr = session.createCriteria(Person.class);
		Order order = Order.asc("personAge");
		ctr.addOrder(order);
		List<Person> list = ctr.list();
		for (Person person : list) {
			System.out.println(person);
		}
	}

}
