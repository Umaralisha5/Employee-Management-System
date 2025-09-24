package com.umaralisha;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 * Servlet implementation class SampHttp
 **/
@WebServlet("/SampHttp")
public class SampHttp extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public SampHttp() {}
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
        PrintWriter out = res.getWriter();
        out.println("<h1> Welcome to doGet </h1>");
        doPost(req,res);

}
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        PrintWriter out = res.getWriter();
        out.println("<h1> Welcome to DoPost</h1>");

}
}