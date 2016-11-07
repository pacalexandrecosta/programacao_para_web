package nassau.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ExemploEL007
 */
@WebServlet("/ExemploEL007")
public class ExemploEL007 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int numeroSorte = (int) (Math.random() * 100);
		HttpSession session = request.getSession();
		session.setAttribute("numeroSorte", numeroSorte);
		response.sendRedirect("ExemploEL007.jsp");
	}
}
