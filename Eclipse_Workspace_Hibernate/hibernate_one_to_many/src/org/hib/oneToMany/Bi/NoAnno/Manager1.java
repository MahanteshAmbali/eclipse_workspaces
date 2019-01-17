package org.hib.oneToMany.Bi.NoAnno;

import org.hibernate.Session;

public class Manager1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Session session = Util.getSession();
		
		Student student1 = new Student();
		Student student2 = new Student();
		
		student1.setFirstName("Mahantesh");
		student1.setLastName("Ambali");
		
		student2.setFirstName("Sagar");
		student2.setLastName("Ambali");
		
		Mails mails = new Mails();
		mails.setUserName("mahantesh378@gmail.com");
		mails.setPassWord("1234");
		mails.setStudent(student1);
		
		Mails mails1 = new Mails();
		mails1.setUserName("mahantesh218@gmail.com");
		mails1.setPassWord("1234");
		mails1.setStudent(student1);
		student1.setMails(new Mails[]{mails, mails1});
		
		Mails mails2 = new Mails();
		mails2.setUserName("sagar.123@gmail.com");
		mails2.setPassWord("2345");
		mails2.setStudent(student2);
		
		Mails mails3 = new Mails();
		mails3.setUserName("sagar.21@gmail.com");
		mails3.setPassWord("3245");
		mails3.setStudent(student2);
		student2.setMails(new Mails[]{mails2, mails3});
		
		session.beginTransaction();
		session.save(mails);
		session.save(mails1);
		session.save(mails2);
		session.save(mails3);
		
		session.getTransaction().commit();
		
		session.flush();
		session.close();
		
		
		
		System.out.println("Done");		
	}
}
