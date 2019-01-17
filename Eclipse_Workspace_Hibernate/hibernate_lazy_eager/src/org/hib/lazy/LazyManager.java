/* 
 * Program to demonstrate lazy loading 
*/

package org.hib.lazy;

import org.hibernate.Session;

public class LazyManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Session s1 = Util.getSession();
/*		Order o1 = (Order) s1.load(Order.class, "1001");				//VALID ID
		
		System.out.println("------------");
		System.out.println("Order Id:"+o1.getOrderId());
		System.out.println("Customer Name: "+o1.getCustomerName());
		System.out.println("Order Quantity: "+o1.getQuantity());
		System.out.println("Item Price: "+o1.getPrice());
*/
		
		/*
		 * ORDER ID IS LOADED 1ST WHEN OTHER ATTRIBS ARE  depending upon lazy value. 
		 * REQUESTED DEN IT GOES TO DB.
		 */
		Order o2 = (Order) s1.load(Order.class, "191");				//INVALID ID
		
		System.out.println("------------");
		System.out.println("Order Id:"+o2.getOrderId());
		System.out.println("Customer Name: "+o2.getCustomerName());
		System.out.println("Order Quantity: "+o2.getQuantity());
		System.out.println("Item Price: "+o2.getPrice());

	}

}
