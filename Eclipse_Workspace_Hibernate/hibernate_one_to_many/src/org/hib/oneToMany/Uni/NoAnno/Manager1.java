package org.hib.oneToMany.Uni.NoAnno;

import org.hibernate.Session;

public class Manager1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Session session = Util.getSession();
		
		Student student = new Student();
		
		student.setFirstName("Mahantesh");
		student.setLastName("Ambali");
		
		Mails mails = new Mails();
		mails.setUserName("mahantesh378@gmail.com");
		mails.setPassWord("1234");
		mails.setStudent(student);
		
		Mails mails1 = new Mails();
		mails1.setUserName("mahantesh218@gmail.com");
		mails1.setPassWord("1234");
		mails1.setStudent(student);
		
		session.beginTransaction();
		session.save(mails);
		session.save(mails1);
		session.getTransaction().commit();
		
		session.flush();
		session.close();
		
		
		System.out.println("Done");		
	}
}
