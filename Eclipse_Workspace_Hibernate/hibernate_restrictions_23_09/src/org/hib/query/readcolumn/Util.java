package org.hib.query.readcolumn;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Util {

	private static Configuration cfg = null;
	private static SessionFactory sf = null;
	
	static{
		cfg = new Configuration().configure();
		sf = cfg.buildSessionFactory();
	}
	
	public static Session getSession(){
		return sf.openSession();
	}
}