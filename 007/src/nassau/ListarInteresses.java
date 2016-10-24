package nassau;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListarInteresses extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		String[] interesses = req.getParameterValues("interesses");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.append("Email:").append(email).append("<br>");
		out.append("Interesses: <br>");
		for (int i = 0; i < interesses.length; i++) {
			out.append(interesses[i]);
			out.append("</br>");
		}
	}

}
