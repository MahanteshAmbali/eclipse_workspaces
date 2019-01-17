package com.skanda.pss.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.skanda.pss.dto.Product;
import com.skanda.pss.util.HibernateUtil;

/**
 * Servlet implementation class AddController1
 */
public class AddController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddController() {
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
		
		Product productDto = new Product();
		productDto.setProductId(productId);
		productDto.setProductName(productName);
		productDto.setProductModelNo(productModelNo);
		productDto.setProductPrice(Double.parseDouble(productPrice));
		productDto.setProductCondition(productCondition);
		productDto.setProductAvailability(Integer.parseInt(productAvailability));
		
		Transaction transaction = null;
		Session session = null;
		try{
		session = HibernateUtil.getSession();
		transaction = session.beginTransaction();
		session.save(productDto);
		transaction.commit();
		}catch(HibernateException ex){
			if(transaction != null){
				transaction.rollback();
			}
		}finally{
			HibernateUtil.closeSession(session);
		}
	}

}
