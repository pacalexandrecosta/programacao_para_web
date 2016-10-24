package nassau;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.xml.internal.ws.client.SenderException;

import nassau.DAO.DisciplinaDAO;

public class Disciplina extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		DisciplinaDAO disciplinaDAO = new DisciplinaDAO();
		String semestreParameter = req.getParameter("semestre");
		if (semestreParameter == null || semestreParameter.equals("")) {
			if (req.getAttribute("semestre") != null) {
				semestreParameter = req.getAttribute("semestre").toString();
			} else {
				resp.sendRedirect("Semestre");
			}
		}
		int semestre = Integer.parseInt(semestreParameter);

		if (semestre > 2) {
			resp.sendRedirect("Semestre");
		}

		List<nassau.model.Disciplina> disciplinas = disciplinaDAO.getDisciplinasPorSemestre(semestre);
		StringBuilder sb = new StringBuilder();
		sb.append("<html>");
		sb.append("<body>");
		sb.append("Disciplinas disponíveis </br>");
		if (req.getAttribute("semestre") != null) {
			sb.append("Por favor, escolha no mínimo duas disciplinas. </br>");
		}
		sb.append("<form action=\"Matricula\" method=\"post\">");
		for (nassau.model.Disciplina d : disciplinas) {
			sb.append("<input type=\"checkbox\"");
			sb.append("name=\"disciplinas\"");
			sb.append("value=\"" + d.getId() + "\">");
			sb.append(d.getTitulo());
		}
		sb.append("<input type=\"hidden\" name=\"semestre\" value=\"" + semestre + "\">");
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
