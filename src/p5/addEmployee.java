package p5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class addEmployee
 */
public class addEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		int age=Integer.parseInt(request.getParameter("age"));
		int salary=Integer.parseInt(request.getParameter("salary"));
		String gender= request.getParameter("gender");
		String dept= request.getParameter("dept");
		String state= request.getParameter("state");
		String city= request.getParameter("city");
		String check[] = request.getParameterValues("java");
	    String comment = request.getParameter("comment") ;
	     
	    Employee emp = new Employee(fname,lname,age,salary,gender,dept,state,city,check,comment);
	 	
	}

}
