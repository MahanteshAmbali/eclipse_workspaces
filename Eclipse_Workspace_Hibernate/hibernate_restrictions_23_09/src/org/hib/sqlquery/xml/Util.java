package org.hib.sqlquery.xml;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Util {

	private static Configuration cfg = null;
	private static SessionFactory sf = null;
	
	static{
		cfg = new Configuration();
		cfg.configure("hibernate1.cfg.xml");
		sf = cfg.buildSessionFactory();
	}
	
	public static Session getSession(){
		return sf.openSession();
	}
}
