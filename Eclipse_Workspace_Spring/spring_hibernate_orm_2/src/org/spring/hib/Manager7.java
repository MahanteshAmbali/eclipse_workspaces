package org.spring.hib;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;

public class Manager7 {

	public static void main(String[] args) {

		HibernateTemplate hibernateTemplate = Util.getTemplate("hibernateTemplate");
		HibernateCallback hcb = new HibernateCallback() {
			@Override
			public Object doInHibernate(Session arg0) throws HibernateException {
				List<Person> list = arg0.createCriteria(Person.class).list();
				return list;
			}
		};
		
		List<Person> list = hibernateTemplate.execute(hcb);
		for (Person person : list) {
			System.out.println(person.getId());
			System.out.println(person.getFirstName());
			System.out.println(person.getLastName());
			System.out.println(person.getAge());
			System.out.println("-------------------");
		}
	}
}
