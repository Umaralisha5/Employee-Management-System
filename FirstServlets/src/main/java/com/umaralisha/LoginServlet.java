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


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	Connection con=null;
	Statement st=null;
    public LoginServlet() {
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
        String username = request.getParameter("username");
        String pass = request.getParameter("password");
        ResultSet rs=st.executeQuery("select * from users where uname='"+username+"' and pass='"+pass+"'");
        RequestDispatcher rd=null;
        if(rs.next())
        {
                	rd=request.getRequestDispatcher("/welcome.html");
                	rd.forward(request, response);
        }
        else
        {
        	request.setAttribute("msg", "Invalid login.....Please login again");
        	rd=request.getRequestDispatcher("/loginUser.jsp");
        	rd.forward(request, response);
        	
        }}
        	
		catch(SQLException e)
		{
		System.out.println(e.getMessage());
		}
		}}

