package myAddressBook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class GestorDB {
	Connection connect;
	
	public void conectarDB() {
		try {
			Class.forName("org.sqlite.JDBC");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String url = "database.db";
		try {
			connect = DriverManager.getConnection("jdbc:sqlite:"+url);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void insertarDato(String tabla, String dato) {
		try {
			connect.setAutoCommit(false);
			Statement stmt = connect.createStatement();
			String query = "INSERT INTO "+tabla+" (valor) VALUES ('"+dato+"');";
			stmt.executeUpdate(query);
			stmt.close();
			connect.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void cerrarDB() {
		try {
			connect.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
