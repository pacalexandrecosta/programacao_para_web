package nassau;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Identificacao")
public class Identificacao extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		String nomePar = req.getParameter("nome");
		String nomeCookie = null;
		Cookie[] cookies = req.getCookies();
		if (cookies != null) {
			for (Cookie c : cookies) {
				if (c.getName().equals("nome")) {
					nomeCookie = c.getValue();
				}
			}
		}
		if (nomeCookie == null && nomePar != null) {
			Cookie c = new Cookie("nome", nomePar);
			c.setMaxAge(2 * 60);
			resp.addCookie(c);
			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();
			out.print("Usuario foi identificado");
		} else if (nomeCookie == null && nomePar == null) {
			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();
			out.print("Por favor, informe um nome");
			RequestDispatcher dispatcher = req.getRequestDispatcher("Identificacao.html");
			resp.sendRedirect("Identificacao.html");
		} else if (nomeCookie != null) {
			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();
			out.print("Usuario ja esta identificado");
			out.print("Seja bem vindo de volta "+nomeCookie);
		}

	}

}
