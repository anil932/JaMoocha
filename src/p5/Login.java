package p5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  
    	   String username=request.getParameter("username");
    	   String password=request.getParameter("password");
    	   
    	  if(username.equals("anil")  && password.equals("anil123")) 
    		  {
    		  request.getRequestDispatcher("login.html").include(request, response);	  
    		  }
    	  else
    	  {
    		  response.sendRedirect("loginerror.html");   	  }
       
    	   }
    
}
