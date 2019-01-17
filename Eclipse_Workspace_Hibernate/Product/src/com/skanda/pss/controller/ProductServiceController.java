package com.skanda.pss.controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.skanda.pss.dto.Product;
import com.skanda.pss.service.ProductService;
import com.skanda.pss.serviceimpl.ProductServiceImpl;

public class ProductServiceController extends GenericServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {
		
		if( true /* getProduct */){
		//get all input values and bind them to local variables.
		String productId =request.getParameter("productId");
		
		ProductService productService = new ProductServiceImpl();
		Product product = productService.getProductById(productId);
		
		request.setAttribute("product", product);
		}
		
		if( true/* Add Product*/){
			
			
		}
		
		if( true/* update Product*/){
					
				}
		if( true/* delete Product*/){
			
		}

		
	}

}
