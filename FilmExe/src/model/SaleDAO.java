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
				+ "total, start_date, end_date, person_id) VALUES ("
				+ ""+sale.getTotal()+", '"+sale.getStar_date()+"',"
				+ "'"+sale.getEnd_date()+"', "+idPerson+")";

		return executeSql.executeDML(sql);
	}

	public Sale searchSales(int idPerson) throws SQLException{
		sql = "SELECT s.* FROM sale s " +
          "WHERE s.person_id = "+idPerson+" " +
          "ORDER BY s.id DESC LIMIT 1";

		resultSet = executeSql.executeQuery(sql);			
		
		if(resultSet.next()){
			return new Sale(resultSet.getInt(1), resultSet.getDouble(2), resultSet.getTimestamp(3).toLocalDateTime(),
			resultSet.getTimestamp(4).toLocalDateTime());
		}
		return null;
	}

	public Object[][] searchSale(String cc) throws SQLException{
		
		Object[][] data = new Object[countAllSale()][5];

		sql = "SELECT p.cc, "
    		+ "p.name, "
    		+ "s.start_date, "
    		+ "s.end_date, "
    		+ "s.total "
    		+ "FROM sale s "
    		+ "JOIN person p ON s.person_id = p.id";
				//+ "WHERE p.cc = '"+cc+"'";
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

		while (resultSet.next()) {
			countRow = resultSet.getInt(1);
		}
		return countRow;
	}

	public boolean updateSaleTotal(int idSale){
		sql = "UPDATE sale s "
        + "SET s.total = ("
        + "  SELECT SUM(ss.price) "
        + "  FROM seat_sale ss "
        + "  WHERE ss.sale_id = " + idSale + ") "
        + "WHERE s.id = " + idSale;
		return executeSql.executeDML(sql);
	}
}
