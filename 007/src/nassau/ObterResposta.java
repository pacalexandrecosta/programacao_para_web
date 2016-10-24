package nassau;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ObterResposta extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String resposta = req.getParameter("resposta");
		PrintWriter out = resp.getWriter();
		if (resposta.equals("correta"))
			out.append("Certa Resposta");
		else
			out.append("Você errou.");
	}
}
