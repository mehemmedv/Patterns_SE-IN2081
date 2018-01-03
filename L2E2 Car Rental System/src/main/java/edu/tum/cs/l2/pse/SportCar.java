package edu.tum.cs.l2.pse;

public class SportCar extends Car {
	private boolean superCharger;
	
	public int getDailyCost() {
		if(superCharger)
			return 12;
		return 10;
	}
	
	public boolean hasSuperCharger() {
		return superCharger;
	}
	
	public void setSuperCharger(boolean superCharger) {
		this.superCharger = superCharger;
	}
}
