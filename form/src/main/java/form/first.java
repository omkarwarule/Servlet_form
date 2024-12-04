package form;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class first extends HttpServlet
{

	
	 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	 {  String email = request.getParameter("email"); 
	 	String password = request.getParameter("password"); 
	 	String remember = request.getParameter("remember");  
	 	System.out.println("Email: " + email); 
	 	System.out.println("Password: " + password); 
	 	System.out.println("Remember: " + remember); 
	 	response.setContentType("text/html"); 
	 	response.getWriter().print("omkar");

	 	response.getWriter().println("<h1>Form submitted successfully!</h1>");
	 	
	 
	}

}
