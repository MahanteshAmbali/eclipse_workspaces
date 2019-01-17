package org.hib;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

/**
 * Servlet implementation class DisplayAll
 */
public class DisplayAll extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayAll() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		session.beginTransaction();
		
		Query query = session.createSQLQuery("select * from Product_Updation");
		List<Object[]> list = query.list();
		PrintWriter out = response.getWriter();
		
		for (Object[] objects : list) {
			out.println(Arrays.toString(objects));
			out.println("</br>");
		}
		
		out.println("<center>");
		out.println("<a href = 'home.jsp'>HOME</a>");
		out.println("<center>");
	}

}
