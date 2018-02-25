package fr.istic.sir.rest.objectsJson;
/**
 * POJO to be used for the WS to give te JSON Formatted response
 * @author Diego Cardenas
 *
 */
public class PersonJSON {
	private String name;
	private String email;
	private String lastName;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
