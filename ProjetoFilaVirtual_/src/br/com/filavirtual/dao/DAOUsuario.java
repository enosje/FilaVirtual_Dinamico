package br.com.filavirtual.dao;

import java.sql.Connection;
import java.util.List;

import br.com.filavirtual.entidades.Usuario;
import br.com.filavirtual.jdbc.ConnectionFactory;

public class DAOUsuario implements DAOBase<Usuario>{

	private Connection con;

	public DAOUsuario() {
		con = new ConnectionFactory().getConnection();
	}

	@Override
	public void adicionar(Usuario objeto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(Usuario objeto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterar(Usuario objeto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Usuario> lista() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario get(long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
