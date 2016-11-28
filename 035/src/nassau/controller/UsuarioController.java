package nassau.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import nassau.model.Usuario;

/**
 * Servlet implementation class UsuarioController
 */
@WebServlet("/Usuario")
public class UsuarioController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String acao = request.getParameter("acao");
		String nome = request.getParameter("nome");
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		if (acao == null)
			acao = "";

		HttpSession sessao = request.getSession();
		Object usuarioObj = sessao.getAttribute("usuario");

		switch (acao) {
		case "login":

			if (usuarioObj == null) {
				Usuario u = new Usuario();
				u.setNome(nome);
				u.setLogin(login);
				u.setSenha(senha);
				sessao.setAttribute("usuario", u);
				RequestDispatcher rd = request.getRequestDispatcher("Home.jsp");
				rd.forward(request, response);
			} else {
				response.sendRedirect("Home.jsp");
			}
			break;
		default:
			if (usuarioObj == null) {
				response.sendRedirect("Login.html");
			} else {
				RequestDispatcher rd = 
				request.getRequestDispatcher("Home.jsp");
				rd.forward(request, response);
			}

			break;
		}

	}

}
