package model;

import database.ExecuteSql;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Class that is responsible for managing the person table in the database
 *
 * @author initmanfig
 */
public class PersonDAO {

    private String sql;
    private ExecuteSql executeSql;
    private ResultSet resultSet;

    public PersonDAO() {
        executeSql = new ExecuteSql();
    }

    /**
     * method that is responsible insert person the database
     *
     * @param person is an object that represent a person in the model
     * @return true if a person is inserted successfully; false otherwise
     */
    public boolean insertPerson(Person person) {

        sql = "INSERT INTO person ("
                + "cc, name, last_name, phone, address, email) VALUES ("
                + "'" + person.getCc() + "', '" + person.getName() + "', '" + person.getLastName() + "',"
                + "'" + person.getPhone() + "', '" + person.getAdress() + "', '" + person.getEmail() + "')";

        return executeSql.executeDML(sql);
    }

    /**
     * method that is responsible delete person the database
     *
     * @param cc is string by which it will be deleted
     * @return true if the person is deleted successfully; false otherwise
     */
    public boolean deletePerson(String cc) {
        sql = "DELETE FROM person WHERE cc = '" + cc + "'";
        return executeSql.executeDML(sql);
    }

    /**
     * method that is responsible update person the database
     *
     * @param cc is string by which it will be searched
     * @param person it is the object that brings the new information that will be in the DB
     * @return true if find the person and update successfully; false otherwise
     */
    public boolean updatePerson(String cc, Person person) {
        sql = "UPDATE person "
                + "SET name = '" + person.getName() + "', last_name = '" + person.getLastName() + "', "
                + "phone = '" + person.getPhone() + "', address = '" + person.getAdress() + "', email = '" + person.getEmail() + "' "
                + "WHERE cc = '" + cc + "'";
        return executeSql.executeDML(sql);
    }

    /**
     * method that is responsible search person the database
     *
     * @param cc is string by which it will be searched
     * @return an object type Person if find the person.
     * @throws SQLException will have to be controlled (bad syntax sql, error connection).
     */
    public Person searchPerson(String cc) throws SQLException {

        sql = "SELECT * FROM person WHERE cc = '" + cc + "'";

        resultSet = executeSql.executeQuery(sql);

        if (resultSet.next()) {
            return new Person(cc, resultSet.getString("name"), resultSet.getString("last_name"), resultSet.getString("phone"),
                    resultSet.getString("address"), resultSet.getString("email"));
        }
        return null;
    }

    /**
     * method for show all person registered in database
     *
     * @return Object[][] if exist persons
     * @throws SQLException will have to be controlled (bad syntax sql, error connection)
     */
    public Object[][] showAllPerson() throws SQLException {

        Object[][] data = new Object[countAllPerson()][6];

        sql = "SELECT * FROM person";

        resultSet = executeSql.executeQuery(sql);

        int i = 0;
        while (resultSet.next()) {
            data[i][0] = resultSet.getString(2);
            data[i][1] = resultSet.getString(3);
            data[i][2] = resultSet.getString(4);
            data[i][3] = resultSet.getString(5);
            data[i][4] = resultSet.getString(6);
            data[i][5] = resultSet.getString(7);
            i++;
        }
        return data;
    }

    public int countAllPerson() throws SQLException {
        sql = "SELECT COUNT(*) FROM person";
        resultSet = executeSql.executeQuery(sql);

        int countRow = 0;

        while (resultSet.next()) {
            countRow = resultSet.getInt(1);
        }
        System.out.println("cantidad de datos" + countRow);
        return countRow;
    }
}
