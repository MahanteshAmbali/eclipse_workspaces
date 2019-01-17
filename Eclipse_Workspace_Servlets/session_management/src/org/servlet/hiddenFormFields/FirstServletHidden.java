package org.servlet.hiddenFormFields;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServletHidden
 */
public class FirstServletHidden extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServletHidden() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String userName = request.getParameter("param1");
		//out.print("Hello, "+userName);
		
		out.println("<form action = 'SecondServletHidden' method = 'post'>");
		out.println("<input type= 'hidden' name = 'uName' value = '"+userName+"'/>");
		out.println("</br><input type= 'submit' value = 'Submit'>");
		out.println("</form>");
	}

}
