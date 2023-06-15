package com.xworkz.favourite.servlet;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/fav")
public class Favourite extends HttpServlet {

	public Favourite() {
		System.out.println("running favourite using no arg const..");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("serive in favourite");
		super.service(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("dopost method in favourite");

		req.setAttribute("food", req.getParameter("food"));
		req.setAttribute("place", req.getParameter("place"));
		req.setAttribute("person", req.getParameter("person"));

		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/InfoDisplay.jsp");
		requestDispatcher.forward(req, resp);
	}

}
