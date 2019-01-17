package org.hib.oneToMany;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class FetchData {

	public static void main(String[] args) {  
	      
	    Session session=new Configuration().configure("hibernate.cfg.xml")  
	                          .buildSessionFactory().openSession();  
	      
	   // Query query=session.createQuery("from Question");
	    Criteria criteria = session.createCriteria(Question.class);
	    
	    List<Question> list = criteria.list();  
	    for (Question question : list) {
			System.out.println(question);
		}
	    
	    session.close();  
	    System.out.println("success");  
	}  
}
