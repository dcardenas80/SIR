package fr.istic.sir.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import fr.istic.sir.rest.objectsJson.PersonJSON;
import fr.istic.sir.rest.objectsJson.ResponseJSON;
import fr.istic.sir.tp4.datamodel.Person;
import fr.istic.sir.tp4.jpa.dao.PersonDAO;

@Path("/opowerws")
public class OPowerWS {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String oPowerHi() {
		return "Salut depuis OPOWER";
	}

	@POST
	@Path("/createperson")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public ResponseJSON createPerson(PersonJSON personJSON) {

		Person person = new Person();
		person.setName(personJSON.getName());
		person.setLastName(personJSON.getLastName());
		person.setEmail(personJSON.getEmail());
		PersonDAO personDao = new PersonDAO();
		personDao.create(person);
		ResponseJSON responseJSON = new ResponseJSON();
		responseJSON.setState("OK");
		responseJSON.setObjectToSave(person);
		return responseJSON;
	}
	
	@DELETE @Path("deletePerson/{id}")
    @Produces({ MediaType.APPLICATION_JSON })
    public ResponseJSON deleteById(@PathParam("id") String arg0) {
		PersonDAO  personDAO = new PersonDAO();
		Person person = personDAO.read(Long.parseLong(arg0));
        personDAO.delete(person);
		ResponseJSON responseJSON = new ResponseJSON();
		responseJSON.setState("OK");
		responseJSON.setObjectToSave(person);
		return responseJSON;
    }

}
