package fr.istic.sir.rest.objectsJson;
/**
 * Pojo to be used to format the response in a JSON Object
 * @author Diego
 *
 */
public class ResponseJSON {
	private String state;
	private Object objectToSave;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Object getObjectToSave() {
		return objectToSave;
	}

	public void setObjectToSave(Object objectToSave) {
		this.objectToSave = objectToSave;
	}
}
