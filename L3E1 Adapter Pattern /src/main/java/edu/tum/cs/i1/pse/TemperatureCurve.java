package edu.tum.cs.i1.pse;

import java.text.DecimalFormat;

public class TemperatureCurve {

	public static void main(String[] args) {

		
		ThermoInterface thermo = new ThermoAdapter();
		
		DecimalFormat df = new DecimalFormat("#.#");

		for (int i = 0; i < 5; i++) {
			System.out.println(df.format(thermo.getTempC()));
		}

	}

}
