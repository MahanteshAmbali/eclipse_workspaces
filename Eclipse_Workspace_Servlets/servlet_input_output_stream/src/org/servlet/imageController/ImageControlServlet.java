package org.servlet.imageController;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ImageControlServlet
 */
public class ImageControlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ImageControlServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		ServletOutputStream servletInputStream = response.getOutputStream();
		
		//FileInputStream fin = new FileInputStream("C:\\Users\\Public\\Pictures\\Sample Pictures\\Tulips.jpg");
		Random random = new Random();
		int value = random.nextInt(8);
		
		if(value > 0){
			FileInputStream fin = new FileInputStream("C:\\Users\\Public\\Pictures\\Sample Pictures\\Images\\"+value+".jpg");
			BufferedInputStream bin = new BufferedInputStream(fin);
		
			BufferedOutputStream bOut = new BufferedOutputStream(servletInputStream);
		
			int ch = 0;
			while((ch = bin.read()) != -1){
				bOut.write(ch);
			}
			
			bOut.close();
			bin.close();
			fin.close();
		}
		
		if(value == 0){
			response.sendRedirect("index.jsp");
		}
		servletInputStream.close();
	}
}
