package com.umaralisha;

import java.io.IOException;
import java.sql.Connection;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class UpdateEmp
 */
@WebServlet("/UpdateEmp")
public class UpdateEmp extends HttpServlet {
	
	 Connection con=null;
	   Statement st=null;
	   PreparedStatement pst=null;
	   private static final long serialVersionUID = 1L;
	    public  UpdateEmp()
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
       
    /**
     * @see HttpServlet#HttpServlet()
     */
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		 try
         {
        	 int id =Integer.parseInt(request.getParameter("eid"));
        	 PrintWriter pw=response.getWriter();
        	 ResultSet rs=st.executeQuery("select * from employee where eid="+id);
        	 if(rs.next()) {
        		 //   int eid = Integer.parseInt(request.getParameter("eid"));
        		    String name = request.getParameter("ename");
        		    float salary = Float.parseFloat(request.getParameter("salary"));
        		    System.out.println(id + " " + name + " " + salary);
        		    
        		    pst = con.prepareStatement("update employee set ename=?, salary=? where eid=?");
        		    pst.setString(1, name);
        		    pst.setFloat(2, salary);
        		    pst.setInt(3, id);
        		    pst.executeUpdate();
        		    //con.commit();
        		    
        		    request.setAttribute("msg", "Record Updated suc....");
        		    RequestDispatcher rd = request.getRequestDispatcher("Status.html");
        		    rd.forward(request,response);
        	 }
        		    
        	 }
        		    catch(SQLException e)
                {
         			System.out.println(e.getMessage());
          }
          

	}}
