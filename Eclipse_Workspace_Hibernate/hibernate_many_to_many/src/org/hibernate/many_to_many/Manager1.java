package org.hibernate.many_to_many;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Manager1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Session session = null;
		Transaction transaction = null;
		
		Student student1 = new Student();
		student1.setFirstName("Mahantesh");
		student1.setLastName("Ambali");
		
		Student student2 = new Student();
		student2.setFirstName("Sagar");
		student2.setLastName("Dell");
		
		Batches batch1 = new Batches();
		batch1.setCourseName("Java");
		batch1.setDuration("3months");
		
		Batches batch2 = new Batches();
		batch2.setCourseName("J2EE");
		batch2.setDuration("6months");
		
		batch1.addStudent(student1);
		batch1.addStudent(student2);
		batch2.addStudent(student1);
		batch2.addStudent(student2);
		
		try{
			session = new Configuration().configure().buildSessionFactory().openSession();
			transaction =  session.beginTransaction();
			session.persist(student1);
			session.persist(student2);
			session.persist(batch1);
			session.persist(batch2);
			
			transaction.commit();
			session.flush();
		}catch(Exception ex){
			ex.printStackTrace();
			transaction.rollback();
		}finally{
			session.close();
		}
		System.out.println("Done");
	}

}
