package org.servlet.first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class XmlServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String userName= req.getParameter("userName");
		String userId = req.getParameter("useId");
		
		out.println("Hello "+ userName + " .!");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String userName= req.getParameter("userName");
		String userId = req.getParameter("useId");
		String password = req.getParameter("passWord");
		
		out.println("Username: "+ userName + " .!<br/>");
		out.println("Password: "+ password + " .!");
	}
}
