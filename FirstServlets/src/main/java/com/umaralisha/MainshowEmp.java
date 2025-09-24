package com.umaralisha;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MainshowEmp")
public class MainshowEmp extends HttpServlet {
   Connection con=null;
   Statement st=null;
   private static final long serialVersionUID = 1L;
    public MainshowEmp()
    {
        super();
        try
         {
	  Class.forName("com.mysql.cj.jdbc.Driver");  
	  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb?allowPublicKeyRetrieval=true&useSSL=false","root","root");
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
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
{
     try
     {
        PrintWriter pw=response.getWriter();
        ResultSet rs=st.executeQuery("select * from employee");
        pw.print("<table border='1' align='center'>");
        pw.print("<tr><th>EmpID</th><th>EmpName</th><th>EmpSalary</th></tr>");
        while(rs.next())
        {
        	pw.print("<tr>");
        	pw.print("<td>"+rs.getString(1)+"</td>");
	pw.print("<td>"+rs.getString(2)+"</td>");
	pw.print("<td>"+rs.getString(3)+"</td>");
	pw.print("</tr>");
         }
        pw.print("</table>");
      }
     catch(SQLException e)
     {
	System.out.println(e.getMessage());
     }
     System.out.println("success");
}

}