package org.servlet.httpSession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FirstServletSession
 */
public class FirstServletSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServletSession() {
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
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("username", userName);
		/*out.println("</br> Session Id: "+httpSession.getId());
		out.println("</br> Session Creation Time: "+httpSession.getCreationTime());
		out.println("</br> Session Last Accssed Time: "+httpSession.getLastAccessedTime());
		*/
		out.println("</br> <a href = 'SecondServletSession'>Visit</a>");
	}

}
