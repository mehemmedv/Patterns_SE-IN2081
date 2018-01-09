package edu.tum.cs.i1.pse;

import edu.tum.cs.i1.pse.ThermoInterface;
import edu.tum.cs.i1.thermometers.FahrenheitThermo;

public class ThermoAdapter implements ThermoInterface {
	
	private FahrenheitThermo thermo;
	
	public ThermoAdapter() {
		thermo = new FahrenheitThermo();
	}
	
	public double getTempC() {
		return (thermo.getFarenheitTemperature() - 32.0) * (5.0/9.0);
	}
}
