package fr.istic.sir.tp4.jpa.dao;

import fr.istic.sir.tp4.datamodel.Heater;
import fr.istic.sir.tp4.jpa.EntityManagerHelper;
import fr.istic.sir.tp4.jpa.dao.interfaces.GenericDao;

public class HeaterDAO implements GenericDao<Heater, Long> {

	public Heater create(Heater heater) {
		// TODO Auto-generated method stub
		EntityManagerHelper.beginTransaction();
		EntityManagerHelper.getEntityManager().persist(heater);
		EntityManagerHelper.commit();
		return heater;
	}

	public Heater read(Long id) {
		// TODO Auto-generated method stub
		EntityManagerHelper.beginTransaction();
		Heater heater = EntityManagerHelper.getEntityManager().find(Heater.class, id);
		return heater;
	}

	public Heater update(Heater heater) {
		// TODO Auto-generated method stub
		heater = EntityManagerHelper.getEntityManager().merge(heater);
		EntityManagerHelper.commit();
		return heater;
	}

	public void delete(Heater heater) {
		// TODO Auto-generated method stub
		EntityManagerHelper.beginTransaction();
		EntityManagerHelper.getEntityManager().remove(heater);
		
	}

}
