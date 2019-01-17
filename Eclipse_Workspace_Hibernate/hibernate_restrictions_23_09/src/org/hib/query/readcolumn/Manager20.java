package org.hib.query.readcolumn;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class Manager20 {

	public static void main(String[] args) {

		Session session = Util.getSession();
		Query query = session.createQuery("select personFirstName, personAge, personSalary from Person where personEducation = :arg0");
		query.setString("arg0", "%be%");
		List<Object[]> list = query.list();
		for(Object[] personDetails : list){
			System.out.println(Arrays.toString(personDetails));
		}
	}

}
