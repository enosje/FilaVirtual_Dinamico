package br.com.filavirtual.service;

import br.com.filavirtual.dao.DAOUsuario;
import br.com.filavirtual.entidades.Usuario;

public class AutenticaUsuarioService {

	DAOUsuario dao;
	boolean autenticado;

	public boolean autenticarUsuario(String nome, String senha) {
		autenticado = false;
		dao = new DAOUsuario();
		for (Usuario usuario : dao.lista()) {

			if (usuario.getNome().equals(nome)
					&& usuario.getSenha().equals(senha)) {
				autenticado = true;
				return autenticado;

			}

		}

		return autenticado;
	}
}
