package org.hib.query;

import java.util.List;

import org.hibernate.Session;

public class Manager3 {

	public static void main(String[] args) {

		Session s1 = Util.getSession();
		List<Person> list = s1.createQuery("from Person where personFirstName = 'Mahantesh'and personAddress = 'BTM' and personSalary = 30000").list();
		for(Person person : list){
			System.out.println(person);
		}
	}

}
