package edu.tum.cs.l2.pse;

import java.sql.Date;

public class Person {
	private String name;
	private String drivingLicenceNumber;
	private Date dateOfBirth;
	
	public Person(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDrivingLicenceNumber() {
		return drivingLicenceNumber;
	}
	
	public void setDrivingLicenceNumber(String drivingLicenceNumber) {
		this.drivingLicenceNumber = drivingLicenceNumber;
	}
	
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setDateOfBirth(Date date) {
		dateOfBirth = date;
	}
}
