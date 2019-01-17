package com.skanda.pss.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import com.skanda.pss.dao.ProdcutServicesDAO;
import com.skanda.pss.daoimpl.ProductServicesDAOImpl;
import com.skanda.pss.dto.Product;
import com.skanda.pss.service.ProductService;

/**
 * 
 * This is a service class to manage all products with different services like 
 * add, update, delete and getting the product details.
 * @author Skanda
 *
 */
public class ProductServiceImpl implements ProductService {

	/**
	 * This method fetches all products from DataStore.
	 */
	public List<Product> getProducts(){
		
		List<Product> productsList  = new ArrayList<Product>();
		
		ProdcutServicesDAO productServiceDAO = new ProductServicesDAOImpl();
		productsList =  productServiceDAO.getProducts();
		
		return productsList;
	}

	@Override
	public Product getProductById(String productId) {

		ProdcutServicesDAO productServiceDAO = new ProductServicesDAOImpl();
		Product product = productServiceDAO.getProductById(productId);
			
		return product;
	}
	
}


