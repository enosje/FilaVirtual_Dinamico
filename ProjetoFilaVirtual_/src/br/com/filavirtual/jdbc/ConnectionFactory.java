package br.com.filavirtual.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection getConnection() {

		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/teste",
					"root", "1234");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}

	}

}
