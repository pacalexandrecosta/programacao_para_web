package nassau;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AcessoUsuario extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession sessao = req.getSession(true);
		int acesso = 0;
		
		sessao.setMaxInactiveInterval(2222);

		Object acessoObj = sessao.getAttribute("acessos");
		if (acessoObj == null) {
			sessao.setAttribute("acessos", 0);
			acessoObj = sessao.getAttribute("acessos");
		}

		acesso = Integer.parseInt(acessoObj.toString());
		acesso++;
		sessao.setAttribute("acessos", acesso);

		PrintWriter out = resp.getWriter();
		out.print("Este e o seu acesso de número " + acesso);

	}
}
