package org.spring.hib;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate4.HibernateTemplate;

public class ReadByHibTempFindByCriteria {

	public static void main(String[] args) {

		HibernateTemplate hibernateTemplate = (HibernateTemplate) Util.getTemplate("hibernateTemplate");
		List<Person> list = (List<Person>) hibernateTemplate.findByCriteria(DetachedCriteria.forClass(Person.class));
		System.out.println("--------------------");
		for (Person person : list) {
			System.out.println(person.getId());
			System.out.println(person.getFirstName());
			System.out.println(person.getLastName());
			System.out.println(person.getAge());
			System.out.println("----------------");
		}
		
	}

}
