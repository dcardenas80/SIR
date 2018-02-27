package fr.istic.sir.tp4.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.istic.sir.tp4.datamodel.Person;
import fr.istic.sir.tp4.jpa.dao.PersonDAO;

@WebServlet(name = "person", urlPatterns = { "/person" })
public class PersonServlet extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
          PersonDAO personDAO = new PersonDAO();
        List<Person> personList = personDAO.readAll();
        for (Person person : personList) {
        	out.println("<HTML>\n<BODY>\n" + "<H1>Personne trouvé</H1>\n" + "<UL>\n" + " <LI>Prenom: "
    				+ person.getName() +"</UL>\n" + "<UL>\n" + " <LI>Nom: "
    				+ person.getLastName() +"</UL>\n" + "<UL>\n" + " <LI>Age: "
    				+ person.getAge() +"</UL>\n" + "<UL>\n" + " <LI>Email: "
    				+ person.getEmail() +"</UL>\n" +"</BODY></HTML>");
		}
     	
	}

}
