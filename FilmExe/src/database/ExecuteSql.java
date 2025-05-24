
package database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;

public class ExecuteSql {

	public boolean executeDML(String sql) { 
	
		boolean check = false;	

		try {Connection connection = new ConnectionBD().getConnection();
			PreparedStatement ps = connection.prepareStatement(sql);

			int valid = ps.executeUpdate();		

			if (valid > 0) check = true;

		} catch (SQLException e) {
			System.out.println("El error es: " + e.toString());
			check = false;
		}
		return check;
	}

	public ResultSet ejecutarConsulta(String sql) {

		ResultSet data = null;

		try {Connection connection = new ConnectionBD().getConnection();
			PreparedStatement ps = connection.prepareStatement(sql);
			data = ps.executeQuery();

		} catch (SQLException e) {
			System.out.println("El error es: " + e.toString());
			data = null;
		}
		return data;
	}
}
