package org.hib.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

public class Manager1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Session s1 = Util.getSession();
		Order order = new Order();
		Criteria c1 = s1.createCriteria(Order.class);
		List<Order> orders = c1.list();
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
