package com.umaralisha;
import java.io.IOException;
import java.sql.Connection;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteEmp
 */
@WebServlet("/DeleteEmp")
public class DeleteEmp extends HttpServlet {
   Connection con=null;
   Statement st=null;
   private static final long serialVersionUID = 1L;
    public  DeleteEmp()
    {
       
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
        	 int id =Integer.parseInt(request.getParameter("eid"));
        	 ResultSet rs=st.executeQuery("select * from employee where eid="+id);
        	 
        	 if(rs.next())
        	 {
        		 st.executeUpdate("delete from employee where eid="+id);
        		 RequestDispatcher rd=request.getRequestDispatcher("Status.html");	
        		 rd.forward(request,response);
        	 }
        	 else
        	 {
        		 request.setAttribute("msg","Invalid Eid. please Try Again");
        		 RequestDispatcher rd=request.getRequestDispatcher("DelSearch.jsp");
        		 rd.forward(request,response);
        	 }
         }
         catch(SQLException e)
         {
 			System.out.println(e.getMessage());
  }
    }

        	 }
        
