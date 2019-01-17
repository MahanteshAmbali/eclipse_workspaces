package org.hib.oneToOne.uniDir.WithAnno;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Util {

	private static Configuration configuration = null;
	private static SessionFactory sessionFactory = null;
	
	static{
		configuration = new Configuration();
		configuration.configure();
		sessionFactory = configuration.buildSessionFactory();
	}
	
	public static Session getSession(){
		return sessionFactory.openSession();
	}
}
