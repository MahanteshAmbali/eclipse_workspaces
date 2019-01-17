package com.skanda.pss.dao;

import java.util.List;

import com.skanda.pss.dto.Product;

public interface ProdcutServicesDAO {
	
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
