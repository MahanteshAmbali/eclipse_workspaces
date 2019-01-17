package org.hib.first;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class Manager7 {

	public static void main(String[] args) {
		
		Session session = Util.getSession();
		Query qry = session.createQuery("from Person_Component_mapping");
		List<Person> list = qry.list();
		for(Person person : list){
			System.out.println(person);
		}
	}
}
