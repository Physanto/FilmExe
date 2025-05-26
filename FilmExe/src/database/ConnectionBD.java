package database;

import java.sql.*;

public class ConnectionBD {

	static String bd = "filmexe_db";
	static String user = "root";
	static String password = "12345";
	static String url = "jdbc:mysql://localhost:3306/" + bd + "?useUnicode=true";		
	Connection connection = null;

	public ConnectionBD() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, user, password);

			if (connection != null) {
				System.out.println("Conexión a base de "
						+ "datos " + bd + " OK");
			}
		} catch (SQLException ex) {
			System.out.println(ex);
		} catch (ClassNotFoundException ex) {
			System.out.println(ex);
		}
	}

	public Connection getConnection() {
		return connection;
	}

	public void disconnect() {

		if(connection != null){
			
			try{
				connection.close();
			}
			catch(SQLException ex){
				System.out.println(ex);
			}
			connection = null;
		}
	}
}