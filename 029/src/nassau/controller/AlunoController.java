package nassau.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nassau.dao.AlunoDAO;
import nassau.model.Aluno;
import nassau.util.Acoes;

@WebServlet("/Aluno")
public class AlunoController extends HttpServlet {

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		AlunoDAO dao = new AlunoDAO();
		String acaoParam = request.getParameter("acao") == null ? "" : request.getParameter("acao");
		String idParam = request.getParameter("id");
		String nomeParam = request.getParameter("nome");
		String redirecionamento = "";
		switch (acaoParam) {
		case Acoes.DELETAR:
			int idDeletar = Integer.parseInt(idParam);
			try {
				dao.deletar(idDeletar);
				response.sendRedirect("Aluno");
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case Acoes.LISTAR:
			try {
				List<Aluno> alunos = dao.getAlunos();
				request.setAttribute("alunos", alunos);
				redirecionamento = "WEB-INF/ListarAluno.jsp";
				request.getRequestDispatcher(redirecionamento).forward(request, response);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case Acoes.ATUALIZAR:
			try {
				int idAtualizar = Integer.parseInt(idParam);
				Aluno alunoAtualizar = dao.getAlunoById(idAtualizar);
				request.setAttribute("aluno", alunoAtualizar);
				redirecionamento = "WEB-INF/InserirAluno.jsp?acao=Atualizar";
				request.getRequestDispatcher(redirecionamento).forward(request, response);

			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case Acoes.INSERIR:
			redirecionamento = "WEB-INF/InserirAluno.jsp?acao=Inserir";
			request.getRequestDispatcher(redirecionamento).forward(request, response);
			break;
		case Acoes.DETALHES:
			try {
				int idDetalhes = Integer.parseInt(idParam);
				Aluno alunoDetalhes = dao.getAlunoById(idDetalhes);
				request.setAttribute("aluno", alunoDetalhes);
				redirecionamento = "WEB-INF/Detalhes.jsp";
				request.getRequestDispatcher(redirecionamento).forward(request, response);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		default:

			try {
				List<Aluno> alunos = dao.getAlunos();
				request.setAttribute("alunos", alunos);
				redirecionamento = "WEB-INF/ListarAluno.jsp";
				request.getRequestDispatcher(redirecionamento).forward(request, response);

			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			break;
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			AlunoDAO dao = new AlunoDAO();
			String acao = request.getParameter("acao");
			String idParam = request.getParameter("id");
			String nomeParam = request.getParameter("nome");
			if (acao.equals(Acoes.INSERIR)) {
				dao.inserir(nomeParam);
			} else if (acao.equals(Acoes.ATUALIZAR)) {
				int id = Integer.parseInt(idParam);
				dao.atualizar(id, nomeParam);
			}
			response.sendRedirect("Aluno");
		} catch (ClassNotFoundException |

				SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
