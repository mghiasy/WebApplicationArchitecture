package mum.Controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet
 */

//???? WebServlet
//@WebServlet("/calc")
public class CalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CalculatorServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String calc = "/calculator.jsp";
		RequestDispatcher view = getServletContext().getRequestDispatcher(calc);
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String add1 = request.getParameter("add1").trim() ;
		String add2 = request.getParameter("add2").trim();
		String mult1 = request.getParameter("mult1").trim();
		String mult2 = request.getParameter("mult2").trim();

		Calculator sum;
		// Check for valid inputs....
		try {
			Integer a1 = Integer.parseInt(add1);
			Integer a2 = Integer.parseInt(add2);
			sum = new Calculator(a1, a2);
		} catch(NumberFormatException e) {
			if (add1.isEmpty()) add1 = "''";
			if (add2.isEmpty()) add2 = "''";
			sum = new Calculator(0, 0);
		}

		/*
		 * Integer.parseInt(str) throws NumberFormatException
		 * if the string cannot be converted to an integer.
		 */
		Calculator product;
		try {
			Integer m1 = Integer.parseInt(mult1);
			Integer m2 = Integer.parseInt(mult2);
			product = new Calculator(m1, m2);
		} catch(NumberFormatException e) {
			if (mult1.isEmpty()) mult1 = "''";
			if (mult2.isEmpty()) mult2 = "''";
			product = new Calculator(0, 0);
		}

		request.setAttribute("add1", add1);
		request.setAttribute("add2", add2);
		request.setAttribute("sum", sum);
		request.setAttribute("mult1", mult1);
		request.setAttribute("mult2", mult2);
		request.setAttribute("product", product);

		String calc = "/result.jsp";
		RequestDispatcher view = getServletContext().getRequestDispatcher(calc);
		view.forward(request, response);
	}

}
