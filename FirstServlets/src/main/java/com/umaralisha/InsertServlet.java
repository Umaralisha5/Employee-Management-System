package com.umaralisha;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/InsertServlet")
public class InsertServlet extends HttpServlet {
   Connection con=null;
   Statement st=null;
   private static final long serialVersionUID = 1L;
    public  InsertServlet()
    {
        super();
        try
         {
	  Class.forName("com.mysql.cj.jdbc.Driver");  
	  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb?llowPublicKeyRetrieval=true&useSSL=false","root","root");
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
         try
         {
        	 int id=Integer.parseInt(request.getParameter("eid"));
        	 String name=request.getParameter("ename");
        	 float salary=Float.parseFloat(request.getParameter("salary"));
        	 System.out.println(id+" "+name+" "+salary+" ");
        	 st.executeUpdate("insert into employee values("+id+",'"+name+"',"+salary+")");
        	 st.close();
        	 con.close();
         }
         catch(SQLException e)
         {
        			System.out.println(e.getMessage());
         }
         PrintWriter pw=response.getWriter();
         pw.print("Emp Recorded is inserted sucess.........");
    }}
