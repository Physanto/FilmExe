
package controller;
import java.sql.SQLException;
import model.Person;
import model.PersonDAO;

/**
 * Class that is responsible to controller person
 * @author initmanfig
 */
public class PersonController {

	private PersonDAO personDAO;

	public PersonController(){
		personDAO = new PersonDAO();
	}

	/**
	 * method that insert a person the database
	 * @param person is object that will be inserted in the database
	 * @return true if insert the person successfully; false otherwise
	 */
	public boolean insertPerson(Person person){
		return personDAO.insertPerson(person);
	}

	/**
	 * method that delete a person the database
	 * @param cc is string by which it will be deleted
	 * @return true if the person is deleted successfully; false otherwise
	 */
	public boolean deletePerson(String cc){
		return personDAO.deletePerson(cc);
	}
	
	/**
	 * method that update a person the database
	 * @param cc is string by which it will be searched
	 * @param person it is the object that brings the new information that will be in the DB
	 * @return true if find the person and update successfully; false otherwise
	 */
	public boolean updatePerson(String cc, Person person){
		return personDAO.updatePerson(cc, person);
	}

	/**
	 * method that seeks the person in the database
	 * @param cc is string by which it will be searched
	 * @return an object type Person if find; null otherwise
	 */
	public Person searchPerson(String cc){

		try{
			return personDAO.searchPerson(cc);
		}
		catch(SQLException ex){
			return null;
		}
	}
	
	/**
	 * method that will show all person registered in the database
	 * @return Object[][] if exist persons; null otherwise
	 */
	public Object[][] showAllPerson(){

		try{
			return personDAO.showAllPerson();
		}
		catch(SQLException ex){
			return null;
		}
	}
}
