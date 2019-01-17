package org.spring.hib;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;

public class Manager9 {

	public static void main(String[] args) {

		HibernateTemplate hibernateTemplate = Util.getTemplate("hibernateTemplate");
		HibernateCallback hibernateCallback = new HibernateCallback() {
			
			@Override
			public Object doInHibernate(Session arg0) throws HibernateException {
				List<Person> list = arg0.createQuery("from Person").list();
				return list;
			}
		};
		
		List<Person> list = hibernateTemplate.execute(hibernateCallback);
		System.out.println("---------------");
		for (Person person : list) {
			System.out.println(person.getId());
			System.out.println(person.getFirstName());
			System.out.println(person.getLastName());
			System.out.println(person.getAge());
			System.out.println("---------------");
		}
	}

}
