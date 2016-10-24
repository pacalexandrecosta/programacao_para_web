package nassau;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Matricula extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String[] disciplinas = req.getParameterValues("disciplinas");
		if (disciplinas.length < 2) {
			req.setAttribute("semestre", req.getParameter("semestre"));
			RequestDispatcher rd = req.getRequestDispatcher("Disciplinas");
			rd.forward(req, resp);
		} else {
			resp.sendRedirect("sucesso.html");
		}
	}
}
