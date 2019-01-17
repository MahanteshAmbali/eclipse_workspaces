package com.skanda.pss.service;

import java.util.List;

import com.skanda.pss.dto.Product;

/**
 * 
 * This is a service interface to manage all products with different services like 
 * add, update, delete and getting the product details.
 * @author Skanda
 *
 */
public interface ProductService {
	
	/**
	 * This method fetches all products from DataStore.
	 */
	public List<Product> getProducts();
	
	/**
	 * This method returns Product information for the given product id.
	 * @param productId
	 * @return {@link Product}
	 */
	public Product getProductById(String productId);
	

}
