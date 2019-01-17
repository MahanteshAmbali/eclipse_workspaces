package org.hib.query.readcolumn;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class Manager18 {

	public static void main(String[] args) {

		Session session = Util.getSession();
		Query query = session.createQuery("select personAge from Person");
		List<Integer> list = query.list();
		for(Integer age : list){
			System.out.println(age);
		}
	}

}
