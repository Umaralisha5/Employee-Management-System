package com.umaralisha;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class welcoServlet
 */
@WebServlet("/welcoServlet")
public class welcoServlet extends HttpServlet {
	private static final long serialVersionUID = 1;
	public welcoServlet() {}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String name1=req.getParameter("t1");
		String fname=req.getParameter("t2");
		String lname=req.getParameter("t3");
		String pno=req.getParameter("no");
		String email=req.getParameter("email");
		String Gender=req.getParameter("Gender");
		String password=req.getParameter("pass");
		
		
		
		PrintWriter out=res.getWriter();
		if("Male".equalsIgnoreCase(Gender)) {
			out.println("<h1>Welcome Mr. "+fname +lname+"</h1>");
		}
		if("Female".equalsIgnoreCase(Gender)) {
			out.println("<h1>Welcome Mrs. "+fname +lname+"</h1>");
		}
		else {
			out.println("<h1>Welcome  "+fname +lname+"</h1>");
		}
			
		out.println("<h1>Your User name is "+name1+"</h1>");
		out.println("<h1>Your phone Number is "+pno+"</h1>");
		out.println("<h1>Your Email ID is "+email+"</h1>");
		
		
	}

}
