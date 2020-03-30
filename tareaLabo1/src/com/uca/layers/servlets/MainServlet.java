package com.uca.layers.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MainServlet
 */
@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String user = request.getParameter("user");
		String pass = request.getParameter("pass");
		String defaultU = "Leo"; //User quemado
		String defaultP = "leoparedes"; //Pass quemada
		
		PrintWriter out = response.getWriter();
		
		if(user.equals(defaultU) && pass.equals(defaultP)) {
			out.println("<html>");
			out.println("<body>");
			out.println("<h4>" + "Welcome!");
			out.println("<h3>" + "Nice to see u again " + user + "</h3>");
			out.println("</body>");
			out.println("</html>");
		} else {
			out.println("<html>");
			out.println("<body>");
			out.println("<h4>" + "Who are U?");
			out.println("<h3>" + "Denied Acces..." + "</h3>");
			out.println("</body>");
			out.println("</html>");
		}
	}

}
