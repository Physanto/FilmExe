
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

	public boolean insertSeatSale(int idVenta, int idUsuario){

		sql = "INSER INTO sale_seat ("
				+ "price, ";
                return true;
	}
}
