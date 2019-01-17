package org.hib;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

/**
 * Servlet implementation class Delete
 */
public class Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Delete() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String productId = request.getParameter("productId");
		String deleteQuery = "delete from Product_Updation where Product_Id="+productId;
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		session.beginTransaction();
		
		Query query = session.createSQLQuery(deleteQuery);
		query.executeUpdate();
		
		session.getTransaction().commit();
		
		session.flush();
		session.close();
		System.out.println("Product with id: "+productId+" deleted.");
		response.sendRedirect("home.jsp");
	}

}
