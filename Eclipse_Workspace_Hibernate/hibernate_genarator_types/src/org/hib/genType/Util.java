package org.hib.genType;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Util {

	private static Configuration cfg = new Configuration();
	private static SessionFactory sf = null;
	
	static{
		cfg.configure();
		sf = cfg.buildSessionFactory();
	}
	
	
	public static Session getSession(){
		
		return sf.openSession();
	}
}
