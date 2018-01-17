package fr.istic.sir.tp4.jpa.dao;

import fr.istic.sir.tp4.datamodel.ElectronicDevice;
import fr.istic.sir.tp4.jpa.EntityManagerHelper;
import fr.istic.sir.tp4.jpa.dao.interfaces.GenericDao;

public class ElectronicDeviceDAO implements GenericDao<ElectronicDevice, Long> {

	public ElectronicDevice create(ElectronicDevice electronicDevice) {
		// TODO Auto-generated method stub
		EntityManagerHelper.beginTransaction();
		EntityManagerHelper.getEntityManager().persist(electronicDevice);
		EntityManagerHelper.commit();
		return electronicDevice ;
	}

	public ElectronicDevice read(Long id) {
		// TODO Auto-generated method stub
		EntityManagerHelper.beginTransaction();
		ElectronicDevice electronicDevice = EntityManagerHelper.getEntityManager().find(ElectronicDevice.class, id);
		return electronicDevice;
	}

	public ElectronicDevice update(ElectronicDevice electronicDevice) {
		// TODO Auto-generated method stub
		electronicDevice =EntityManagerHelper.getEntityManager().merge(electronicDevice);
		EntityManagerHelper.commit();
		return electronicDevice;
	}

	public void delete(ElectronicDevice electronicDevice) {
		// TODO Auto-generated method stub
		EntityManagerHelper.beginTransaction();
		EntityManagerHelper.getEntityManager().remove(electronicDevice);
		
	}

}
