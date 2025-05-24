
package controller;
import model.Person;
import model.PersonDAO;

/**
 *
 * @author initmanfig
 */

public class PersonController {

	private PersonDAO personDAO;

	public PersonController(){
		personDAO = new PersonDAO();
	}

	public boolean insertPerson(Person person){
		return personDAO.insertPerson(person);
	}

	public boolean deletePerson(String cc){
		return personDAO.deletePerson(cc);
	}

	public boolean updatePerson(String cc, Person person){
		return personDAO.updatePerson(cc, person);
	}
}
