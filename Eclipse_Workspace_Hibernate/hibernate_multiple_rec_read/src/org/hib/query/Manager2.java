package org.hib.query;

import java.util.List;

import org.hib.criteria.Order;
import org.hibernate.Query;
import org.hibernate.Session;

public class Manager2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Session s1 = Util.getSession();
		Order o1 = new Order();
		Query q1 = s1.createQuery("from Order");
		List<Order> orders = q1.list();
		for (Order order2 : orders) {
			System.out.println("-------------------------");
			System.out.println("Order Id: "+order2.getOrderId());
			System.out.println("Customer Name: "+order2.getCustomerName());
			System.out.println("Item Price: "+order2.getPrice());
			System.out.println("Item Quantity: "+order2.getQuantity());
			System.out.println("-------------------------");
		}
		
		System.out.println("Done");
	}

}
