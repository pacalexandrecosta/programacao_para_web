package nassau;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javafx.util.converter.LocalDateStringConverter;

public class CadastrarInteresse extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String email = req.getParameter("email");
		String interessePolitica = req.getParameter("politica");
		String interesseEsportes = req.getParameter("esportes");
		String interesseMusica = req.getParameter("musica");
		String interesseCinema = req.getParameter("cinema");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		StringBuilder sb = new StringBuilder();
		sb.append("Email:").append(email).append("</br>");
		sb.append("Interesse em política?").append(interessePolitica == null?"Não":"Sim").append("</br>");
		sb.append("Interesse em esportes?").append(interesseEsportes == null?"Não":"Sim").append("</br>");
		sb.append("Interesse em música?").append(interesseMusica == null?"Não":"Sim").append("</br>");
		sb.append("Interesse em cinema?").append(interesseCinema == null?"Não":"Sim").append("</br>");

		out.append(sb.toString());
		
	
	}

}
