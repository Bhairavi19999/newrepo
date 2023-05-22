package com.xworkz.selfish.servlet;

	import java.io.IOException;

	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

	@WebServlet(loadOnStartup = 1, urlPatterns = "/red")
	public class Red  extends HttpServlet {
		public Red () {
			System.out.println("created red using no arg const....");
		}
		@Override
		protected void doGet(HttpServletRequest req, 
				HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("running red");
		}

}
