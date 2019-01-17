package org.servlet.initParms;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String firstInitParam = getInitParameter("DriverName");
		String secondInitParam = getInitParameter("DriverURL");
		
		PrintWriter out = response.getWriter();
		out.println("<b>First Init Param: </b>"+firstInitParam);
		out.println("</br><b>Second Init Param: </b>" + secondInitParam);
		
		Enumeration<String> initParamNames = getInitParameterNames();
		while (initParamNames.hasMoreElements()) {
			String string = (String) initParamNames.nextElement();
			String value ;
			System.out.println(string);
		}
	}

}
