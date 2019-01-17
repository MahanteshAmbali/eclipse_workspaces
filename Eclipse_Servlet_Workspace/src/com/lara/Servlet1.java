package com.lara;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet 
{
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("html/text");
		PrintWriter out = response.getWriter();
		String s1 = getInitParameter("param1");
		String s2 = getInitParameter("param2");
		
		out.println(s1);
		out.println(s2);
		
		System.out.println(s1);
		System.out.println(s2);
	}

}
