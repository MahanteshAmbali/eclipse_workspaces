package org.hib.many_to_many;

import java.util.HashSet;
import java.util.Set;

public class Orders {

	private String orderId;
	private String customerFullName;
	private String locationToDeliver;
	
	private Set<Products> products = new HashSet<Products>();

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getCustomerFullName() {
		return customerFullName;
	}

	public void setCustomerFullName(String customerFullName) {
		this.customerFullName = customerFullName;
	}

	public String getLocationToDeliver() {
		return locationToDeliver;
	}

	public void setLocationToDeliver(String locationToDeliver) {
		this.locationToDeliver = locationToDeliver;
	}

	public Set<Products> getProducts() {
		return products;
	}

	public void setProducts(Set<Products> products) {
		this.products = products;
	}
}
