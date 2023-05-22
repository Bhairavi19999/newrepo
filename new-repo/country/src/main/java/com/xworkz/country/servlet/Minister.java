package com.xworkz.country.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/send")

public class Minister extends HttpServlet {

	public Minister() {
		System.out.println("minister is in no arg cons....");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("do get method for minister..");
		String pm = req.getParameter("pmname");
		System.out.println("pm name is:" + pm);
		resp.setContentType("text/html");
		PrintWriter printWriter = resp.getWriter();
		printWriter.write("<html>");
		printWriter.write("<body>");
		printWriter.write("<h3>");
		printWriter.write("PM INFO");
		printWriter.write("</h3>");
		printWriter.write("Name:" + pm);
		printWriter.write("<br>");
		printWriter.write("<h3><a href='index.html'>HOME</a></h3>");
		printWriter.write("</body>");
		printWriter.write("</html>");

	}

}
