package org.hib;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

/**
 * Servlet implementation class Add
 */
public class Add extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Add() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String productId = request.getParameter("productId");
		String productName = request.getParameter("productName");
		String productModelNo = request.getParameter("productModelNo");
		String productPrice = request.getParameter("productPrice");
		String productCondition = request.getParameter("productCondition");
		String productAvailability = request.getParameter("productAvailability");
		
		Product product = new Product();
		product.setProductId(productId);
		product.setProductName(productName);
		product.setProductModelNo(productModelNo);
		product.setProductPrice(Double.parseDouble(productPrice));
		product.setProductCondition(productCondition);
		product.setProductAvailability(Integer.parseInt(productAvailability));
		
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		session.beginTransaction();
		
		session.save(product);
		session.getTransaction().commit();
		
		session.flush();
		session.close();
		
		System.out.println("Inserted into DB Successfully..!");
		
	}

}
