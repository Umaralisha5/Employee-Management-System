package com.umaralisha;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/FirstServlets")
public class FirstSevlets implements Servlet {
	
    public FirstSevlets() {
        System.out.println("Servlet Instantiation");
    }
    public void init(ServletConfig config) throws ServletException {
        System.out.println("init method");
    }

    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("<h1> Welcome to Mysite </h1>");
        System.out.println("Service method");
    }

    public void destroy() {
        System.out.println("Destroy method");
    }

    public ServletConfig getServletConfig() {
        return null;
    }

    public String getServletInfo() {
        return null;
    }
}