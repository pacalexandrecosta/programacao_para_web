package nassau.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nassau.DAO.LivroDAO;
import nassau.model.Livro;

/**
 * Servlet implementation class LivroController
 */
@WebServlet("/Livro")
public class LivroController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LivroController() {
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String acao = request.getParameter("acao");
		if (acao == null)
			acao = "";

		switch (acao) {
		case "detalhes":
			String idParam = request.getParameter("id");
			if (idParam != null) {
				long id = Long.parseLong(idParam);
				Livro l = new LivroDAO().getLivroById(id);
				request.setAttribute("livro", l);
				request.getRequestDispatcher("WEB-INF/Detalhes.jsp").forward(request, response);
			}
			break;
		case "listar":
		default:
			List<Livro> livros = new LivroDAO().getLivros();
			request.setAttribute("livros", livros);
			request.getRequestDispatcher("WEB-INF/Listar.jsp").forward(request, response);
			break;
		}

	}

}
