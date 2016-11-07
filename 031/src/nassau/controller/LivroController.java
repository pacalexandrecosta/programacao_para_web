package nassau.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
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
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String acao = request.getParameter("acao");

		if (acao == null)
			acao = "";

		switch (acao) {
		case "listar":
		default:
			List<Livro> livros = new LivroDAO().getLivros();
			request.setAttribute("livros", livros);
			RequestDispatcher rd = request.getRequestDispatcher("ExemploEL002.jsp");
			rd.forward(request, response);
			break;
		}

	}

}
