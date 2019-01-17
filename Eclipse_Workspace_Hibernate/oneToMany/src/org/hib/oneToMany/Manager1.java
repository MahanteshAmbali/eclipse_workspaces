package org.hib.oneToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Manager1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Session session = new Configuration().configure().buildSessionFactory().openSession();
		Configuration con = new Configuration();
		con.configure();
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		
		session.beginTransaction();
		
		Employee employee1 = new Employee();
		employee1.setFirstName("Mahantesh");
		employee1.setLastName("Ambali");
		
		AccountNumber accountNumber1 = new AccountNumber();
		accountNumber1.setBankId(2003);
		accountNumber1.setAccountNumber(2934958);
		accountNumber1.setBankName("SBI");
		accountNumber1.setIfscCode("SBI007897");
		
		accountNumber1.setEmployee(employee1);

		AccountNumber accountNumber2 = new AccountNumber();
		accountNumber2.setBankId(8495);
		accountNumber2.setAccountNumber(9847542);
		accountNumber2.setBankName("HDFC");
		accountNumber2.setIfscCode("HDFC0737");
		
		accountNumber2.setEmployee(employee1);
		
		employee1.setAccountNumbers(new AccountNumber[]{accountNumber1, accountNumber2});

		session.persist(employee1);
		session.persist(accountNumber1);
		session.persist(accountNumber2);
		
		session.getTransaction().commit();
		
		session.flush();
		session.close();
		//sf.close();

		System.out.println("Done");
	}
}
