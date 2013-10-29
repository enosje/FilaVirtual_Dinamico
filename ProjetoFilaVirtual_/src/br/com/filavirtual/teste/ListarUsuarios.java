package br.com.filavirtual.teste;

import br.com.filavirtual.dao.DAOUsuario;
import br.com.filavirtual.entidades.Usuario;

public class ListarUsuarios {

	public static void main(String[] args) {

		DAOUsuario dao = new DAOUsuario();
		for (Usuario u : dao.lista()) {

			System.out.println("nome: " + u.getNome() + "\n" + "senha: "
					+ u.getSenha()+"\n");

		}

	}

}
