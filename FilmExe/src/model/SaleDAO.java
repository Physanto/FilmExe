package model;

import java.sql.ResultSet;
import database.ExecuteSql;
import java.sql.SQLException;

/**
 *
 * @author initmanfig
 */
public class SaleDAO {

	private ResultSet resultSet;
	private ExecuteSql executeSql;
	private String sql;

	public SaleDAO(){
		executeSql = new ExecuteSql();
	}

	public boolean makeSale(Sale sale, int idPerson){
		sql = "INSERT INTO sale ("
				+ "total, star_date, end_date person_id) VALUES ("
				+ ""+sale.getTotal()+", '"+sale.getStar_date()+"',"
				+ "'"+sale.getEnd_date()+"', "+idPerson+")";

		return executeSql.executeDML(sql);
	}

	public Object[][] searchSale(String cc) throws SQLException{
		
		Object[][] data = new Object[countAllSale()][5];

		sql = "SELECT p.cc,"
				+ "p.name,"
				+ "s.start_date,"
				+ "s.end_date,"
				+ "s.total"
				+ "FROM sale s "
				+ "JOIN person p ON s.id = p.id "
				+ "WHERE p.cc = '"+cc+"'";
		resultSet = executeSql.executeQuery(sql);

		int i = 0;
		while(resultSet.next()) {
			data[i][0] = resultSet.getString(1);
			data[i][1] = resultSet.getString(2);
			data[i][2] = resultSet.getTimestamp(3);
			data[i][3] = resultSet.getTimestamp(4);
			data[i][4] = resultSet.getDouble(5);
			i++;	
		}
		return data;	
	}

	public int countAllSale() throws SQLException {
			sql = "SELECT COUNT(*) FROM sale";
			resultSet = executeSql.executeQuery(sql);

			int countRow = 0;

			while(resultSet.next()){
				countRow = resultSet.getInt(1);
			}
			return countRow;
        }
}
