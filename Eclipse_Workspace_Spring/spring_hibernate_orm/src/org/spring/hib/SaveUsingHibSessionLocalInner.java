package org.spring.hib;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;

public class SaveUsingHibSessionLocalInner {

	@SuppressWarnings("rawtypes")
	private static HibernateCallback getHibernateCallback(){
		return new HibernateCallback() {

			@Override
			public Object doInHibernate(Session arg0) throws HibernateException {
				Person person = new Person();
				person.setId(4);
				person.setFirstName("Micheal");
				person.setLastName("Dell");
				person.setAge(39);
				
				arg0.beginTransaction();
				arg0.update(person);
				arg0.getTransaction().commit();
				arg0.flush();
				
				return null;
			}	
		};
	}
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		HibernateTemplate hibernateTemplate = (HibernateTemplate) Util.getTemplate("hibernateTemplate");
		hibernateTemplate.execute(getHibernateCallback());
		
		System.out.println("Done");
	}

}
