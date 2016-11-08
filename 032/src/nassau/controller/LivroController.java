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

		List<Livro> livros = new LivroDAO().getLivros();
		request.setAttribute("livros", livros);
		request.getRequestDispatcher("ExemploJSTL004.jsp").forward(request, response);

	}

}
