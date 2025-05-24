
package model;

/**
 *
 * @author Manuel_Juan
 */
public class Person {
	private int id;
	private String cc;
	private String name;
	private String lastName;
	private String phone;
	private String adress;
	private String email;

	public Person(int id, String cc, String name, String lastName, String phone, String adress, String email) {
		this.id = id;
		this.cc = cc;
		this.name = name;
		this.lastName = lastName;
		this.phone = phone;
		this.adress = adress;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCc() {
		return cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}	
}
