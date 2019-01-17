package com.lara;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet2
 */
public class Servlet2 extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("html/text");
		String s1 = getInitParameter("param1");
		String s2 = getInitParameter("param2");
		
		ServletContext c1 = getServletContext();
		String s3 = c1.getInitParameter("context1");
		String s4 = c1.getInitParameter("context2");

		PrintWriter out = response.getWriter();
		out.println("Init Param1: "+s1);
		out.println("<br/>Init Param2: "+s2);
		out.println("<br/>Context Value1: "+s3);
		out.println("<br/>Context Value2: "+s4);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
}
