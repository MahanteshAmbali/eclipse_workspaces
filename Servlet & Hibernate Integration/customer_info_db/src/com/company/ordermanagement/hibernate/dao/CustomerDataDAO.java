package com.company.ordermanagement.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.company.ordermanagement.hibernate.bean.CustomerDetails;

public class CustomerDataDAO {

	public void addCustomerDetails(String customerId, String customerName,
			String customerLocation, String productName,
			String productQuantity, String phoneNumber) {
		
		Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		try {
			
			
			CustomerDetails customerDetails = new CustomerDetails();
			customerDetails.setCustomerId(customerId);
			customerDetails.setCustomerName(customerName);
			customerDetails.setCustomerLocation(customerLocation);
			customerDetails.setProductName(productName);
			customerDetails.setProductQuantity(productQuantity);
			customerDetails.setPhoneNumber(phoneNumber);
			
			session.save(customerDetails);
			session.getTransaction().commit();
			
			System.out.println("Details Added.!");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				if(configuration != null){
					configuration = null;
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
			try {
				if(session != null){
					session.close();
					session = null;
				}
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}
}
