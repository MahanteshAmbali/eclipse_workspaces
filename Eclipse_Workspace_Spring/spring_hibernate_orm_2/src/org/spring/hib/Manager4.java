package org.spring.hib;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;

public class Manager4 {

	public static void main(String[] args) {

		HibernateTemplate hibernateTemplate = Util.getTemplate("hibernateTemplate");
		final Person person = new Person();
		person.setId(2);
		person.setFirstName("Ambali");
		person.setLastName("Mahantesh");
		person.setAge(29);
		
		class MyHibernateCallBack implements HibernateCallback{

			@Override
			public Object doInHibernate(Session arg0) throws HibernateException {
				arg0.beginTransaction();
				arg0.save(person);
				arg0.getTransaction().commit();
				arg0.flush();
				return null;
			}
		}
		
		hibernateTemplate.execute(new MyHibernateCallBack());
		System.out.println("Done");
	}

}
