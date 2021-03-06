package br.com.filavirtual.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.filavirtual.entidades.Usuario;
import br.com.filavirtual.jdbc.ConnectionFactory;

public class DAOUsuario implements DAOBase<Usuario> {

	private Connection con;

	public DAOUsuario() {
		con = new ConnectionFactory().getConnection();
	}

	@Override
	public void adicionar(Usuario objeto) {
		// TODO Auto-generated method stub

		String sql = "insert into Usuario (nomeUsuario,senhaUsuario) values (?,?)";

		try {
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1, objeto.getNome());
			stm.setString(2, objeto.getSenha());

			stm.execute();
			stm.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

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
		String sql = "select * from Usuario";
		List<Usuario> lista = new ArrayList<Usuario>();
		PreparedStatement stm;
		try {
			stm = con.prepareStatement(sql);
			ResultSet rs = stm.executeQuery();
			
			while(rs.next()){
				Usuario u = new Usuario();
				u.setNome(rs.getString("nomeUsuario"));
				u.setSenha(rs.getString("senhaUsuario"));
				
				lista.add(u);
			}
			
			rs.close();
			stm.close();
			return lista;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e); 
		}
	}

	@Override
	public Usuario get(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
