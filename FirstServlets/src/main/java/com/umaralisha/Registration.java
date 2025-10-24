package com.umaralisha;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	Connection con=null;
	Statement st=null;
    public Registration() {
        super();
        try
		{
		  Class.forName("com.mysql.cj.jdbc.Driver");  
		  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb?llowPublicKeyRetrieval=true&SSL=false","root","root");
		  st=con.createStatement();
		}
    	catch(ClassNotFoundException e)
    	{
    	System.out.println("driver not found");
    	}
		catch(SQLException e)
    	{	
    		System.out.println(e.getMessage());
      	}
		
        
    }

	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{ 
		try
		{
		
		  String fname = request.getParameter("fname");
	      String lname = request.getParameter("lname");
	      String uname = request.getParameter("uname");
	      String pwd = request.getParameter("pwd");
	      String email = request.getParameter("email");
	      String phone = request.getParameter("phone");
	      
	  
	      st.executeUpdate("insert into users(fname,lname,uname,pass,email,contact) values('"+fname+"','"+lname+"','"+uname+"','"+pwd+"','"+email+"','"+phone+"')");
	     
	      // get response writer
	       PrintWriter out = response.getWriter();
	      
	       out.println("<h1>Registration is Successful..</h1>");
	       out.println("<a href='loginUser.jsp'>Please Login</a>");
		}
		
		catch(SQLException e)
    	{	
    		System.out.println(e.getMessage());
      	}
		
	}
	
}