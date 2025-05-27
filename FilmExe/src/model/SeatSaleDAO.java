
package model;

import database.ExecuteSql;
import java.sql.ResultSet;

/**
 *
 * @author initmanfig
 */
public class SeatSaleDAO {
	
	private ResultSet resulSet;
	private ExecuteSql executeSql;
	private String sql;

	public SeatSaleDAO(){
		executeSql = new ExecuteSql();
	}

	public boolean insertSeatSale(int idSale, int[] idSeat, double price){

		for (int i = 0; i < idSeat.length; i++) {	
			sql = "INSERT INTO seat_sale ("
					+ "sale_id, seat_id, price) VALUES "
					+ "("+idSale+", "+idSeat[i]+", "+price+")";

			executeSql.executeDML(sql);
		}
		return true;
	}
}
