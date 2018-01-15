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

@WebServlet(name = "updatedPerson", urlPatterns = { "/updatedPerson" })
public class UpdatedPerson extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		PersonDAO personDAO = new PersonDAO();
		Long id  = Long.parseLong(request.getParameter("id"));
		Person person = personDAO.read(id);
		String personName = request.getParameter("newname");
		person.setName(personName);
		personDAO.update(person);
		out.println("<HTML>\n<BODY>\n" + "<H1>Person inserted on DB</H1>\n" + "<UL>\n" + " <LI>Nom: " + personName
				+ "</UL>\n" +request.getRequestURL()+ "</BODY></HTML>");
	}
}
