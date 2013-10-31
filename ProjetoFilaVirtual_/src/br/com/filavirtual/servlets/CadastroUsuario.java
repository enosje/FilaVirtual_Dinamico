package br.com.filavirtual.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.filavirtual.dao.DAOUsuario;
import br.com.filavirtual.entidades.Usuario;

/**
 * Servlet implementation class CadastroUsuario
 */
@WebServlet("/cadastrarUsuario")
public class CadastroUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CadastroUsuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String nome = request.getParameter("nome");
		String senha = request.getParameter("senha");

		Usuario usuario = new Usuario();
		usuario.setNome(nome);
		usuario.setSenha(senha);

		DAOUsuario dao = new DAOUsuario();
		dao.adicionar(usuario);

		RequestDispatcher rd = request
				.getRequestDispatcher("efetuaLogin");
		rd.forward(request, response);

	}

}
