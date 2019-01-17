package com.skanda.pss.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * This is a utility class to manage the connections to the datastore using hibernate
 * session factory and session.
 * @author Skanda
 *
 */
public class HibernateUtil {
	
	static SessionFactory sessionFactory = null;
	
	public static SessionFactory getSessionFactory(){
		
		if(sessionFactory == null){
			sessionFactory = new Configuration().configure().buildSessionFactory();
		}
		
		return sessionFactory;
	}
	
	
	public static  Session getSession(){
		Session session = null;
		if(sessionFactory != null){
			session = sessionFactory.openSession();
		}
		else{
			sessionFactory = getSessionFactory();
			session = sessionFactory.openSession();
		}
		return session;
	}
	
	public static void closeSession(Session session){
		if(session != null && session.isOpen()){
			session.close();
		}
	}
	
	public static void closeSessionFactory(SessionFactory sessionFactory){
		if(sessionFactory != null && !sessionFactory.isClosed()){
			sessionFactory.close();
		}
	}

}
