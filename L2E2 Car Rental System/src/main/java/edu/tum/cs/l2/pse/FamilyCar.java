package edu.tum.cs.l2.pse;

public class FamilyCar extends Car {
	private boolean childSeat;
		
	public int getDailyCost() {
		if(childSeat)
			return 9;
		return 8;
	}
	
	public boolean hasChildSeat() {
		return childSeat;
	}
	
	public void setChildSeat(boolean childSeat) {
		this.childSeat = childSeat;
	}
}
