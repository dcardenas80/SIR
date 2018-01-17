package fr.istic.sir.tp4.jpa.dao;

import fr.istic.sir.tp4.datamodel.Home;
import fr.istic.sir.tp4.jpa.EntityManagerHelper;
import fr.istic.sir.tp4.jpa.dao.interfaces.GenericDao;

public class HomeDAO implements GenericDao<Home, Long	> {

	public Home create(Home home) {
		// TODO Auto-generated method stub
		EntityManagerHelper.beginTransaction();
		EntityManagerHelper.getEntityManager().persist(home);
		EntityManagerHelper.commit();
		return home;
	}

	public Home read(Long id) {
		// TODO Auto-generated method stub
		EntityManagerHelper.beginTransaction();
		Home home = EntityManagerHelper.getEntityManager().find(Home.class, id);
		return home;
	}

	public Home update(Home home) {
		// TODO Auto-generated method stub
		home =EntityManagerHelper.getEntityManager().merge(home);
		EntityManagerHelper.commit();
		return home;
	}

	public void delete(Home home) {
		// TODO Auto-generated method stub
		EntityManagerHelper.beginTransaction();
		EntityManagerHelper.getEntityManager().remove(home);
	}

}
