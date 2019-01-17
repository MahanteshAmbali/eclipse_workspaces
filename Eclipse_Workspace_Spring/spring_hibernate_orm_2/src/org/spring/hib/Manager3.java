package org.spring.hib;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;

public class Manager3 {

	public static void main(String[] args) {

		HibernateTemplate hibernateTemplate = Util.getTemplate("hibernateTemplate");
		final Person person = new Person();
		person.setId(1);
		person.setFirstName("Mahantesh");
		person.setLastName("Ambali");
		person.setAge(29);
		
		HibernateCallback hcb = new HibernateCallback() {
			@Override
			public Object doInHibernate(Session arg0) throws HibernateException {
				
				arg0.beginTransaction();
				Integer obj = (Integer)arg0.save(person);
				arg0.getTransaction().commit();
				
				arg0.flush();
				arg0.close();
				return obj;
			}
		};
		
		hibernateTemplate.execute(hcb);
		System.out.println("Done");
		
	}

}
