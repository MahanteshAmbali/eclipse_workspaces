package org.hib.many_to_many;

import java.util.HashSet;
import java.util.Set;

public class Products {

	private String productId;
	private double productPrice;
	private String productManf;
	
	private Set<Orders> orders = new HashSet<Orders>();

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductManf() {
		return productManf;
	}

	public void setProductManf(String productManf) {
		this.productManf = productManf;
	}

	public Set<Orders> getOrders() {
		return orders;
	}

	public void setOrders(Set<Orders> orders) {
		this.orders = orders;
	}

	public void addOrders(Orders order){
		orders.add(order);
		order.getProducts().add(this);
	}
}
