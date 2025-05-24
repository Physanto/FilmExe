
package model;

import database.ExecuteSql;

/**
 * Class that is responsible for managing the person table in the database
 * @author initmanfig
 */
public class PersonDAO{

	private String sql;
	private ExecuteSql executeSql;

	public PersonDAO(){
		executeSql = new ExecuteSql();
	}

	/**
	 * method that is responsible insert person the database
	 * @param person is an object that represent a person in the model
	 * @return true if a person is inserted successfully; false otherwise
	 */	
	public boolean insertPerson(Person person){	

		sql = "INSERT INTO person ("
				+ "cc, name, last_name, phone, adress, email) VALUES ("
				+ "'"+person.getCc()+"', '"+person.getName()+"', '"+person.getLastName()+"',"
				+ "'"+person.getPhone()+"', '"+person.getAdress()+"', '"+person.getEmail()+"')";

		return executeSql.executeDML(sql);
	}

	public boolean deletePerson(String cc){
		sql = "DELETE FROM person WHERE cc = '"+cc+"'";
		return executeSql.executeDML(sql);
	}

	public boolean updatePerson(String cc, Person person){
		sql = "UPDATE person "
				+ "SET name = '"+person.getName()+"', last_name = '"+person.getLastName()+"', "
				+ "phone = '"+person.getPhone()+"', adress = '"+person.getAdress()+"', email = '"+person.getEmail()+"' "
				+ "WHERE cc = '"+cc+"'";
		return executeSql.executeDML(sql);
	}
}
