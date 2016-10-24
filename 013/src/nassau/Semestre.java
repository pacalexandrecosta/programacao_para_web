package nassau;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Semestre extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		StringBuilder sb = new StringBuilder();
		sb.append("<html>");
		sb.append("<body>");
		sb.append("<form action=\"Disciplinas\" method=\"get\">");
		sb.append("Escolha um semestre: <select name=\"semestre\">");
		for (int i = 1; i <= 2; i++) {
			sb.append("<option value=" + i + ">");
			sb.append(i + "º Semestre");
			sb.append("</option>");
		}
		sb.append("</select>");
		sb.append("</br>");
		sb.append("<input type=\"submit\" value=\"Enviar Escolha\">");
		sb.append("</form>");
		sb.append("</body>");

		sb.append("</html>");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.write(sb.toString());

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
