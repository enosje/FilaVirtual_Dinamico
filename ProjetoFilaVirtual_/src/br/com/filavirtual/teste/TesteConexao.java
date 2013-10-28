package br.com.filavirtual.teste;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.filavirtual.jdbc.ConnectionFactory;

public class TesteConexao {

	public static void main(String[] args) {

		Connection con = new ConnectionFactory().getConnection();

		System.out.println("Ok");
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
