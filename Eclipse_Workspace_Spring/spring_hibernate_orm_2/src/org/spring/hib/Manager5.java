package org.spring.hib;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;

public class Manager5 {

	private static HibernateCallback getHibernateWork(){
				
		return new HibernateCallback() {
			@Override
			public Object doInHibernate(Session arg0) throws HibernateException {
				final Person person = new Person();
				person.setId(1);
				person.setFirstName("Dell");
				person.setLastName("Lenovo");
				person.setAge(20);
				arg0.beginTransaction();
				arg0.update(person);
				arg0.getTransaction().commit();
				arg0.flush();
				return null;
			}
		};
	}
	
	public static void main(String[] args) {

		HibernateTemplate hibernateTemplate = Util.getTemplate("hibernateTemplate");
		hibernateTemplate.execute(getHibernateWork());
	}

}
