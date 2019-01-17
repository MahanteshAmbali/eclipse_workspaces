/*
 * INLINE CALLING. IF THERE ARE MORE THAN ONE DOTS IN 
 * ONE CALLING LINE;
 */

package org.hib.query;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class Manager2 {

	public static void main(String[] args) {

		Session s1 = Util.getSession();
		List<Person> list = s1.createQuery("from Person").list();
		for(Person person : list){
			System.out.println(person);
		}
		
	}

}
