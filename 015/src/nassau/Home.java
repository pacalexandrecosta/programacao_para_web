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

@WebServlet("/Home")
public class Home extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		Cookie[] cookies = req.getCookies();
		String nome = null;
		if (cookies != null) {
			for (Cookie c : cookies) {
				if (c.getName().equals("nome")) {
					nome = c.getValue();
				}
			}
		}

		if (nome != null) {
			PrintWriter out = resp.getWriter();
			resp.setContentType("text/html");
			out.print("Seja bem vindo de volta, <h1>" + nome + "</h1>");
		} else {
			RequestDispatcher dispatcher = req.getRequestDispatcher("Identificacao.html");
			dispatcher.forward(req, resp);
		}
	}
}
