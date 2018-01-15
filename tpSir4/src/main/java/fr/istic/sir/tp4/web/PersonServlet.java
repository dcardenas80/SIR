package fr.istic.sir.tp4.web;

import java.io.IOException;
import java.io.PrintWriter;

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
        String personName = request.getParameter("name");
        Person person = new Person();
        person.setName(personName);
        PersonDAO personDAO = new PersonDAO();
        personDAO.create(person);
		out.println("<HTML>\n<BODY>\n" + "<H1>Person inserted on DB</H1>\n" + "<UL>\n" + " <LI>Nom: "
				+ personName +"</UL>\n" + "</BODY></HTML>");
	}

}
