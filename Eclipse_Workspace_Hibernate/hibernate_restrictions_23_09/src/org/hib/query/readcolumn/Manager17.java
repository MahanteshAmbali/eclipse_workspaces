package org.hib.query.readcolumn;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class Manager17 {

	public static void main(String[] args) {

		Session session = Util.getSession();
		Query query = session.createQuery("select personFirstName from Person");		// personFirstName is POJO attrib not table column name
		List<String> queryList = query.list();
		for (String string : queryList) {
			System.out.println(string);
		}
	}

}
