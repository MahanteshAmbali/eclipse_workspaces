package org.hib;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

/**
 * Servlet implementation class Update
 */
public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Update() {
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
		
		
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		session.beginTransaction();
		
		String updateQuery = "update Product_Updation set Product_name = '"+productName+"',Prod_Model_No = '"+productModelNo+"',Product_Price="+Double.parseDouble(productPrice)
							  +",Product_Condition='"+productCondition+"',Product_availability="+Integer.parseInt(productAvailability)+" where Product_Id="+Integer.parseInt(productId);
		Query query = session.createSQLQuery(updateQuery);
		query.executeUpdate();
		session.getTransaction().commit();
		
		session.flush();
		session.close();
		
		PrintWriter out = response.getWriter();
		out.println("<center>");
		out.println("<a href = 'home.jsp'>HOME</a>");
		out.println("</center>");
		
		System.out.println("Inserted into DB Successfully..!");
	}

}
