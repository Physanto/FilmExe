package model;

import database.ExecuteSql;
import java.sql.ResultSet;
import java.sql.SQLException;

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
            return new Seat(resultSet.getInt("id"), name, resultSet.getDouble("price"));
        }
        return null;
    }
}
