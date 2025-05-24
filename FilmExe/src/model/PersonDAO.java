
package model;

import database.ExecuteSql;

/**
 * Class that is responsible for managing the person table in the database
 * @author initmanfig
 */
public class PersonDAO{

	private String sql;

	public PersonDAO(){}

	/**
	 * method that is responsible insert person the database
	 * @param person is an object that represent a person in the model
	 * @return true if a person is inserted successfully; false otherwise
	 */	
	public boolean insertPerson(Person person){	

		ExecuteSql executeSql = new ExecuteSql();
		sql = "INSERT INTO person ("
				+ "cc, name, last_name, phone, adress, email) VALUES ("
				+ "'"+person.getCc()+"', '"+person.getName()+"', '"+person.getLastName()+"',"
				+ "'"+person.getPhone()+"', '"+person.getAdress()+"', '"+person.getEmail()+"')";

		return executeSql.executeDML(sql);
	}
}
