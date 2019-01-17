package org.spring.hib;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;

public class SaveUsingHibSessionCustomClass {

	public static void main(String[] args) {

		HibernateTemplate hibernateTemplate = (HibernateTemplate) Util.getTemplate("hibernateTemplate");
		final Person person = new Person();
		person.setId(3);
		person.setFirstName("Hello");
		person.setLastName("World");
		person.setAge(20);
		
		class MyHibernateWork implements HibernateCallback{
			
			public Object doInHibernate(Session session)
				throws HibernateException{
				
				session.beginTransaction();
				session.persist(person);
				session.getTransaction().commit();
				session.flush();
				
				return null;
			}
		}
		
		MyHibernateWork myHibernateWork = new MyHibernateWork();
		hibernateTemplate.execute(myHibernateWork);
		
		System.out.println("Done");
	}

}
