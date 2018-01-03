package edu.tum.cs.l2.pse;

public class SUVCar extends Car {
	private boolean terrainMode;
	
	public int getDailyCost() {
		if(terrainMode)
			return 14;
		return 12;
	}
	
	public boolean hasTerrainMode() {
		return terrainMode;
	}
	
	public void setTerrainMode(boolean terrainMode) {
		this.terrainMode = terrainMode;
	}
	
}
