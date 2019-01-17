package com.company.ordermanagement.hibernate.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.company.ordermanagement.hibernate.dao.CustomerDataDAO;

/**
 * Servlet implementation class CustomerDataControllerServlet
 */
public class CustomerDataControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerDataControllerServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		
		String customerId = request.getParameter("customerId");
		String customerName = request.getParameter("customerName");
        String customerLocation = request.getParameter("customerLocation");
        String productName = request.getParameter("productName");
        String productQuantity = request.getParameter("productQuantity");
        String phoneNumber = request.getParameter("phoneNumber");
        
        HttpSession currentSession = request.getSession(true);
        
        try {
			CustomerDataDAO customerDataDAO = new CustomerDataDAO();
			customerDataDAO.addCustomerDetails(customerId, customerName, customerLocation,
											   productName, productQuantity, phoneNumber);
			response.sendRedirect("Success");
		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
		}
	}

}
