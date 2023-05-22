package com.xworkz.country.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/info")
public class CountryServlet extends HttpServlet {
	public CountryServlet() {
		System.out.println("Running CountryServlet using no arg const...");
	}

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("service in CountryServlet...");
		super.service(arg0, arg1);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("get method for CountryServlet");

		String name = req.getParameter("name");
		String code = req.getParameter("code");
		String capitalCity = req.getParameter("capitalCity");
		String population = req.getParameter("population");

		resp.setContentType("text/html");
		PrintWriter respWriter = resp.getWriter();
		respWriter.write("<html>");
		respWriter.write("<body>");
		respWriter.write("<h3>");
		respWriter.write("COUNTRY INFORMATION");
		respWriter.write("</h3>");
		respWriter.write("<br>");
		respWriter.write(name);
		respWriter.write("<br>");
		respWriter.write(code);
		respWriter.write("<br>");
		respWriter.write(capitalCity);
		respWriter.write("<br>");
		respWriter.write(population);
		respWriter.write("<br>");
		respWriter.write("<h3>");
		respWriter.write("<form method='get' action='send'>");
		respWriter.write("</h3>");
		respWriter.write("<br>");
		respWriter.write("<h3>");
		respWriter.write("<ENTER THE PM NAME:>");
		respWriter.write("</h3>");
		respWriter.write("<br>");
		respWriter.write("PM Name<input type='text' name='pmname'>");
		respWriter.write("<input type='submit' value='send'>");
		respWriter.write("</body>");
		respWriter.write("</html>");

	}
}
