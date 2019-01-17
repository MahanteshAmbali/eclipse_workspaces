package com.lara;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Util 
{
	static SessionFactory sf = null;
	
	static
	{
		Configuration cfg = new Configuration();
		cfg.configure();
		sf = cfg.buildSessionFactory(); 
	}
	
	public static Session getSession()
	{
		return sf.openSession();
	}
}