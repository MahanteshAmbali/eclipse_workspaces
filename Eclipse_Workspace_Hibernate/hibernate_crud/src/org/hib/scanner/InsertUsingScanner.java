package org.hib.scanner;

import java.util.Scanner;
import org.hib.update.Order;
import org.hib.util.Util;
import org.hibernate.Session;

public class InsertUsingScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Order o1 = null;
		Session s1 = Util.getSession();
		s1.beginTransaction();
		do {
			o1 = new Order();
			
			System.out.println("Enter Order ID: ");
			o1.setOrderId(sc.nextInt());
			
			System.out.println("Enter Customer Name: ");
			o1.setCustomerName(sc.next());
			
			System.out.println("Enter Order Quantity: ");
			o1.setQuantity(sc.nextInt());
			
			System.out.println("Enter Item Price: ");
			o1.setPrice(sc.nextDouble());
			
			s1.save(o1);
			System.out.println("Continue..? (y/n): ");
		} while ("y".equals(sc.next()));
		s1.getTransaction().commit();
		System.out.println("Done");
	}

}
