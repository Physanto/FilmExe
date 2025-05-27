package model;

import database.ExecuteSql;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SeatDAO {

    private String sql;
    private ExecuteSql executeSql;
    private ResultSet resultSet;

    public SeatDAO() {
        executeSql = new ExecuteSql();
    }

    public boolean insertSeats(String[] seats) {
		StringBuilder sqlT = new StringBuilder();

        sqlT.append("INSERT INTO seat (name, price) VALUES ");

    	for (int i = 0; i < seats.length; i++) {
       		sqlT.append("('").append(seats[i]).append("', 20000)");

        	if (i < seats.length - 1) sqlT.append(", ");
		}	
        return executeSql.executeDML(sqlT.toString());
    }

    public Seat searchSeat(String name) throws SQLException {

        sql = "SELECT * FROM seat WHERE name = '"+name+"'";

        resultSet = executeSql.executeQuery(sql);

        if (resultSet.next()) {
            return new Seat(resultSet.getInt(1), name, resultSet.getDouble(3));
        }
        return null;
    }	

	public ArrayList<Seat> searchSeats(ArrayList<String> names) throws SQLException {
		ArrayList<Seat> seats = new ArrayList<>();

		for(String name : names){
			sql = "SELECT * FROM seat WHERE name = '"+name+"'";

        	resultSet = executeSql.executeQuery(sql);

        	if (resultSet.next()) {	
            	seats.add(new Seat(resultSet.getInt(1), resultSet.getString(2), resultSet.getDouble(3)));
        	}
			resultSet.close();
		}    
		return seats;
    }

	public Object[][] searchSeats(String name) throws SQLException {
		Object[][] data = new Object[4][5];
		sql = "SELECT * FROM seat WHERE name = '"+name+"'";

        	resultSet = executeSql.executeQuery(sql);

        	if (resultSet.next()) {	
        	}
		return data;
    }

	public ArrayList<Seat> seatDisponible() throws SQLException{

		ArrayList<Seat> ids = new ArrayList<>();

		sql = "SELECT s.id, s.name, s.price "
               + "FROM seat s "
               + "JOIN seat_sale ss ON s.id = ss.seat_id "
               + "JOIN sale sa ON ss.sale_id = sa.id "
               + "WHERE NOW() < sa.end_date";
		resultSet = executeSql.executeQuery(sql);

		while(resultSet.next()){
			ids.add(new Seat(resultSet.getInt("id"), resultSet.getString("name"), resultSet.getDouble("price")));
		}
		return ids;
	}
}
