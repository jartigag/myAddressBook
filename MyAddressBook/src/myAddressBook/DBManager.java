package myAddressBook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBManager {
	Connection connect;
	
	public void connectDB() {
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
	
	public void insertData(String table, String data) {
		try {
			connect.setAutoCommit(false);
			Statement stmt = connect.createStatement();
			String query = "INSERT INTO "+table+" (valor) VALUES ('"+data+"');";
			stmt.executeUpdate(query);
			stmt.close();
			connect.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void closeDB() {
		try {
			connect.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
