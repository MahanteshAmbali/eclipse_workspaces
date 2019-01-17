package com.lara;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegServlet extends HttpServlet {
	protected void service(HttpServletRequest r1, HttpServletResponse r2) 
	throws ServletException, IOException {
		{
			String fName=r1.getParameter("firstName");
			String lName=r1.getParameter("lastName");
			String address=r1.getParameter("address");
			String gender=r1.getParameter("gender");
			String education=r1.getParameter("education");
			String[] skills=r1.getParameterValues("skills");
			PrintWriter out=r2.getWriter();
			r2.setContentType("text/html");
			out.println("<center>");
			out.println("<h3>Registration Data</h3>");
			out.println("<hr>");
			out.println("<table border='1'>");
			out.println("<tr> <td>firstName </td>");
			out.println("<td>"+fName+"</td></tr>");
			out.println("<tr> <td>lastName </td>");
			out.println("<td>"+lName+"</td> </tr>");
			out.println("<tr> <td> Address </td>");
			out.println("<td>"+address+"</td> </tr>");
			out.println("<tr> <td> Gender </td>");
			out.println("<td>"+gender+"</td></tr>");
			out.println("<tr> <td> education </td>");
			out.println("<td>"+education+"</td></tr>");
			out.println("<tr> <td> skills </td>");
			out.println("<td>");
			for(String skill:skills)
			{
				out.println(skill+",");
			}
			out.println("</td> </tr>");
		
		out.println("</td> </tr>");
		out.println("</table>");
		out.println("</center");
		}
	}
}
			
			
			
			

