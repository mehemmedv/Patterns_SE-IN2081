package edu.tum.cs.l2.pse;

/*
 * TODO: make the Car class abstarct
 * TODO: add the missing attributes and methods
 * TODO: Add the missing abstract method
 * TODO: Create the missing subclasses
 *
 */

public abstract class Car {
	private String color;
	private int plateNumber;
	private int capacity;
	
	public Car() {
		
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setPlateNumber(Integer plateNumber) {
		this.plateNumber = plateNumber;
	}
	
	public int getPlateNumber() {
		return plateNumber;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}
	
	public abstract int getDailyCost();
	
	public String showInformation() {
		return "some info";
	}
	
}
