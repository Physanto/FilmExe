
package model;

/**
 *
 * @author initmanfig
 */

public class PersonDAO{
	private String sql;

	public PersonDAO(){}
	
	public boolean insertPerson(Person person){	

		HelperDB helperDB = new HelperDB();
		sql = "INSERT INTO person ("
				+ "id, cc, name, last_name, phone, adress, email) VALUES ( ?,?,?,?,?,?,?)";
		helperDB.executeDML(sql, person);
		return true;
	}
}
