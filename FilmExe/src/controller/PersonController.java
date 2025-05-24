
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
	}

	public boolean insertPerson(Person person){	
		return validateData(person) && personDAO.insertPerson(person);
	}

	public boolean validateData(Person person){	
		return person != null && lenghtCorrect(person);
	}

	public boolean lenghtCorrect(Person person) {
		return ((person.getCc().length() >= 8 && person.getCc().length() <= 10) &&
				(person.getName().length() > 0 && person.getName().length() <= 15) && 
				(person.getLastName().length() > 0 && person.getLastName().length() <= 20) &&
				(person.getPhone().length() == 10 && person.getAdress().length() > 0) &&
				person.getEmail().length() > 0);
	}
}
