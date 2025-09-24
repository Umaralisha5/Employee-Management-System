package com.umaralisha;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.GenericServlet;

/**
 * Servlet implementation class GenServlet
 */
@WebServlet("/GenServlet")
public class GenServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("<h1>WELCOME TO OUR WEBSITE</h1>"); 
        out.println("<img src=`download.png`>");
        
        out.println("<p></p>");
        out.println("<form action=``>");
        out.println("<label for=`name`>Name  :</label>");
        out.println("<input type=`text`><br>");
        out.println("<label for=`email`>Email  :</label>");
        out.println("<input type=`text`><br>");
        out.println("<label for=`Password`>Password:</label>");
        out.println("<input type=`text`><br>");
        out.println("<b>Choose your Gender:</b>");
        out.println("<input type=radio id=`MALE` value=`MALE`>");
        out.println("<label for=`MALE`>MALE</label>");
        out.println("<input type=radio id=`FEMALE` value=`FEMALE`>");
        out.println("<label for=`FEMALE`>FEMALE</label><br>");
        out.println("<b>Select your interest:</b>");
        out.println("<input type=checkbox id=`Coding` value=`Coding`>");
        out.println("<label for=`coding`>Coding</label>");
        out.println("<input type=checkbox id=`Reading` value=`Reading`>");
        out.println("<label for=`Reading`>Reading</label><br>");
        
        out.println("<label for=`bio`>Bio(upto 200 words):</label>");
        out.println("<input type=`text`><br>");
        out.println("<button for=`submit`>submit</button>");
        
        out.println("</form>");
        System.out.println("Service method");
        

}
}