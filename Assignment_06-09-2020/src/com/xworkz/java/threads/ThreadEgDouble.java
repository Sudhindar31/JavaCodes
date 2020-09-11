package com.xworkz.java.threads;

import java.util.Arrays;
import java.util.List;

public class ThreadEgDouble implements Runnable {

	@Override
	public void run() {
		Double[] doublearray = { 24.55, 66.48, 89.02, 298.43, 34384.38};
		List<Double> doubleAl = Arrays.asList(doublearray);

		for (Double i : doubleAl) {
			System.out.println(" *** " + i);
		}
	}

}
