/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import database.ExecuteSql;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Devil
 */
public class SeatDAO {

    private String sql;
    private ExecuteSql executeSql;
    private ResultSet resultSet;

    public SeatDAO() {
        executeSql = new ExecuteSql();
    }

    public boolean insertSeats() {

        sql = "INSERT INTO seat (name, price) VALUES ('1A', 20000);";
        sql = "INSERT INTO seat (name, price) VALUES ('1B', 20000);";
        sql = "INSERT INTO seat (name, price) VALUES ('1C', 20000);";
        sql = "INSERT INTO seat (name, price) VALUES ('1D', 20000);";
        sql = "INSERT INTO seat (name, price) VALUES ('1E', 20000);";
        sql = "INSERT INTO seat (name, price) VALUES ('1F', 20000);";
        sql = "INSERT INTO seat (name, price) VALUES ('1G', 20000);";

        sql = "INSERT INTO seat (name, price) VALUES ('2A', 20000);";
        sql = "INSERT INTO seat (name, price) VALUES ('2B', 20000);";
        sql = "INSERT INTO seat (name, price) VALUES ('2C', 20000);";
        sql = "INSERT INTO seat (name, price) VALUES ('2D', 20000);";
        sql = "INSERT INTO seat (name, price) VALUES ('2E', 20000);";
        sql = "INSERT INTO seat (name, price) VALUES ('2F', 20000);";
        sql = "INSERT INTO seat (name, price) VALUES ('2G', 20000);";

        sql = "INSERT INTO seat (name, price) VALUES ('3A', 20000);";
        sql = "INSERT INTO seat (name, price) VALUES ('3B', 20000);";
        sql = "INSERT INTO seat (name, price) VALUES ('3C', 20000);";
        sql = "INSERT INTO seat (name, price) VALUES ('3D', 20000);";
        sql = "INSERT INTO seat (name, price) VALUES ('3E', 20000);";
        sql = "INSERT INTO seat (name, price) VALUES ('3F', 20000);";
        sql = "INSERT INTO seat (name, price) VALUES ('3G', 20000);";

        sql = "INSERT INTO seat (name, price) VALUES ('4A', 20000);";
        sql = "INSERT INTO seat (name, price) VALUES ('4B', 20000);";
        sql = "INSERT INTO seat (name, price) VALUES ('4C', 20000);";
        sql = "INSERT INTO seat (name, price) VALUES ('4D', 20000);";
        sql = "INSERT INTO seat (name, price) VALUES ('4E', 20000);";
        sql = "INSERT INTO seat (name, price) VALUES ('4F', 20000);";
        sql = "INSERT INTO seat (name, price) VALUES ('4G', 20000);";

        sql = "INSERT INTO seat (name, price) VALUES ('5A', 30000);";
        sql = "INSERT INTO seat (name, price) VALUES ('5B', 30000);";
        sql = "INSERT INTO seat (name, price) VALUES ('5C', 30000);";
        sql = "INSERT INTO seat (name, price) VALUES ('5D', 30000);";
        sql = "INSERT INTO seat (name, price) VALUES ('5E', 30000);";
        sql = "INSERT INTO seat (name, price) VALUES ('5F', 30000);";
        sql = "INSERT INTO seat (name, price) VALUES ('5G', 30000);";

        sql = "INSERT INTO seat (name, price) VALUES ('6A', 30000);";
        sql = "INSERT INTO seat (name, price) VALUES ('6B', 30000);";
        sql = "INSERT INTO seat (name, price) VALUES ('6C', 30000);";
        sql = "INSERT INTO seat (name, price) VALUES ('6D', 30000);";
        sql = "INSERT INTO seat (name, price) VALUES ('6E', 30000);";
        sql = "INSERT INTO seat (name, price) VALUES ('6F', 30000);";
        sql = "INSERT INTO seat (name, price) VALUES ('6G', 30000);";

        return executeSql.executeDML(sql);
    }

    public Seat searchSeat(String name) throws SQLException {

        sql = "SELECT * FROM seat WHERE name = '" + name + "'";

        resultSet = executeSql.executeQuery(sql);

        if (resultSet.next()) {
            return new Seat(resultSet.getInt("id"), name, resultSet.getDouble("price"));
        }
        return null;
    }
}
