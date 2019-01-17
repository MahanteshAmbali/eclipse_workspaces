package org.spring.hib;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;

public class SaveUsingHibSessionObj1 {

	public static void main(String[] args) {

		HibernateTemplate hibernateTemplate = (HibernateTemplate) Util.getTemplate("hibernateTemplate");
		
		final Person person1 = new Person();
		person1.setId(1);
		person1.setFirstName("Mahantesh");
		person1.setLastName("Ambali");
		person1.setAge(28);
		
		final Person person2 = new Person();
		person2.setId(2);
		person2.setFirstName("Sagar");
		person2.setLastName("AMBALI");
		person2.setAge(24);
		
		HibernateCallback hibernateCallback = new HibernateCallback() {
			public Object doInHibernate(Session arg0)
				throws HibernateException{
				
				arg0.beginTransaction();
				Object object1 = arg0.save(person1);
				arg0.save(person2);
				arg0.getTransaction().commit();
				arg0.flush();
				
				return object1;
			}
		};
		
		Object personId = hibernateTemplate.execute(hibernateCallback);
		
		System.out.println("Done written: "+personId);
	}

}
