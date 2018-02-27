package fr.istic.sir.tp4.jpa.dao;

import java.util.List;

import fr.istic.sir.tp4.datamodel.Person;
import fr.istic.sir.tp4.jpa.EntityManagerHelper;
import fr.istic.sir.tp4.jpa.dao.interfaces.GenericDao;

public class PersonDAO implements GenericDao<Person, Long> {

	public Person create(Person t) {
		
		EntityManagerHelper.beginTransaction();
		EntityManagerHelper.getEntityManager().persist(t);
		EntityManagerHelper.commit();
		
		return t;
	}

	public Person read(Long id) {
		// TODO Auto-generated method stub
		EntityManagerHelper.beginTransaction();
		Person person = EntityManagerHelper.getEntityManager().find(Person.class, id);
		return person;
	}

	public Person update(Person t) {
		// TODO Auto-generated method stub
		t = EntityManagerHelper.getEntityManager().merge(t);
		EntityManagerHelper.commit();
		return t;
	}

	public void delete(Person t) {
		// TODO Auto-generated method stub
		EntityManagerHelper.beginTransaction();
		EntityManagerHelper.getEntityManager().remove(t);
		EntityManagerHelper.commit();
	}
	public List<Person> readAll(){
		EntityManagerHelper.beginTransaction();
		List<Person> resultList =EntityManagerHelper.getEntityManager().createQuery("Select a from Person a", Person.class).getResultList();
		return resultList;
		
	}

}
