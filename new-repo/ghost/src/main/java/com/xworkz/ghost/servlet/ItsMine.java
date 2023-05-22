package com.xworkz.ghost.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/")

public class ItsMine extends HttpServlet {

	public ItsMine() {
		System.out.println("created ItsMine using no arg const....");
	}

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("running service in itsmine");
		super.service(arg0, arg1);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running dopost in itsmine");
		 RequestDispatcher reqDis=req.getRequestDispatcher("/Display.jsp");
		 reqDis.forward(req, resp);
	}
	
	

	
	
	
}
