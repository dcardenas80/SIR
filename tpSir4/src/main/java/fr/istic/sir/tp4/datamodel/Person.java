package fr.istic.sir.tp4.datamodel;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Person {
	private Long id;
	private String name;
	private List<Home> homes = new ArrayList<Home>();
	private List<ElectronicDevice> electronicDevice = new ArrayList<ElectronicDevice>();
	private List<Person> friends = new ArrayList<Person>();
	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	@ManyToMany(targetEntity = Person.class)
	public List<Person> getFriends() {
		return friends;
	}
	public void setFriends(List<Person> friends) {
		this.friends = friends;
	}
	@OneToMany(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "person_id")
	public List<ElectronicDevice> getElectronicDevice() {
		return electronicDevice;
	}
	public void addElectronicDevice(ElectronicDevice electronicDeviceid) {
		electronicDevice.add(electronicDeviceid);
	}
	@OneToMany(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "person_id")
	public List<Home> getHomes() {
		return homes;
	}
	public void addHomes(Home homeId) {
		homes.add(homeId);
	}
	public void setElectronicDevice(List<ElectronicDevice> electronicDevice) {
		this.electronicDevice = electronicDevice;
	}
	public void setHomes(List<Home> homes) {
		this.homes = homes;
	}

	
	
}
