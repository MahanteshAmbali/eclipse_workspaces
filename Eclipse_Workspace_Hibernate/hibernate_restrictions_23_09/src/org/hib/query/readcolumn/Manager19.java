package org.hib.query.readcolumn;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class Manager19 {

	public static void main(String[] args) {

		Session session = Util.getSession();
		Query query = session.createQuery("select personFirstName, personAge from Person");
		List<Object[]> list = query.list();
		for(Object[] records : list){
			System.out.println(records);
		}
	}

}
