package com.xworkz.java.threads;

import java.util.Arrays;
import java.util.List;

public class ThreadEgInteger implements Runnable {

	@Override
	public void run() {
		Integer[] intarray = { 1, 2, 3, 4, 5, 6 };
		List<Integer> intAl = Arrays.asList(intarray);

		for (int i : intAl) {
			System.out.println(" * " + i);
		}
	}

}
