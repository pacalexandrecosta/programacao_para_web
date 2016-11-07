package nassau.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ExemploEL006
 */
@WebServlet("/ExemploEL006")
public class ExemploEL006 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String login = request.getParameter("login");
		if (login == null || login == "") {
			response.sendRedirect("Login.html");

		} else {
			Cookie c = new Cookie("login", login);
			c.setMaxAge(5 * 60);
			response.addCookie(c);
			response.sendRedirect("ExemploEL006.jsp");
		}
	}

}
