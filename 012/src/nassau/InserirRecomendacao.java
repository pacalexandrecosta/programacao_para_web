package nassau;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InserirRecomendacao extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		String idlivro = req.getParameter("livro");
		int idLivroInt = Integer.parseInt(idlivro);
		Livro l = new LivroDAO().getLivro(idLivroInt);

		//resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.write("<h1>Avisaremos</h1> " + email + " da sugestão do livro : " + l.getTitulo());
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

}
