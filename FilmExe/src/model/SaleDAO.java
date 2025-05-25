package model;

import java.sql.ResultSet;
import database.ExecuteSql;
import java.sql.SQLException;

/**
 *
 * @author initmanfig
 */
public class SaleDAO {
	private ResultSet resulSet;
	private ExecuteSql executeSql;
	private String sql;

	public SaleDAO(){
		executeSql = new ExecuteSql();
	}

	public boolean makeSeal(Sale sale, int idPerson){
		sql = "INSER INTO sale ("
				+ "total, star_date, end_date) VALUES ("
				+ ""+sale.getTotal()+", '"+sale.getStar_date()+"',"
				+ "'"+sale.getEnd_date()+"', "+idPerson+")";

		return executeSql.executeDML(sql);
	}

	public Object[][] searchSeal(String cc) throws SQLException{
		
		sql = "SELECT p.cc,"
				+ "p.name,"
				+ "s.start_date,"
				+ "s.end_date,"
				+ "s.total"
				+ "FROM sale s "
				+ "JOIN person p ON s.id = p.id "
				+ "WHERE p.cc = '"+cc+"'";
		resulSet = executeSql.executeQuery(sql);

		int row = resulSet.getRow();

		if(row <= 0) return null;

		Object[][] data = new Object[row][5];

		for (int i = 0; resulSet.next(); i++) {
			data[i][0] = resulSet.getString("cc");
			data[i][1] = resulSet.getString("name");
			data[i][1] = resulSet.getString("start_date");
			data[i][2] = resulSet.getString("end_date");
			data[i][2] = resulSet.getString("total");
			i++;	
		}
		return data;	
	}
}
