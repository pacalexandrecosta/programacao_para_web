package nassau.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nassau.DAO.EditoraDAO;
import nassau.model.Editora;

@WebServlet("/Editora")
public class EditoraController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public EditoraController() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String acao = request.getParameter("acao");
		if (acao == null)
			acao = "";

		switch (acao) {
		case "listar":
		default:
			List<Editora> editoras = new EditoraDAO().getEditoras();
			request.setAttribute("editoras", editoras);
			RequestDispatcher rd = request.getRequestDispatcher("ExemploEL003.jsp");
			rd.forward(request, response);
			break;
		}

	}

}
