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
import br.com.filavirtual.service.AutenticaUsuarioService;

/**
 * Servlet implementation class AutenticaUsuario
 */
@WebServlet("/efetuaLogin")
public class AutenticaUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AutenticaUsuario() {
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

		String usuario = request.getParameter("usuario");
		String senha = request.getParameter("senha");
		
		RequestDispatcher rd; 
		
		if (new AutenticaUsuarioService().autenticarUsuario(usuario, senha)) {
			request.setAttribute("usuarioLogado", usuario);
			rd = request.getRequestDispatcher("home.jsp");
			rd.forward(request, response);
		}else{
			rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		}
	}

}
