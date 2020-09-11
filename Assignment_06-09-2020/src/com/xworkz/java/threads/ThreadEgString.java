package com.xworkz.java.threads;

import java.util.Arrays;
import java.util.List;

public class ThreadEgString implements Runnable {

	@Override
	public void run() {
		String[] strarray = { "Summer", "Winter", "Spring", "Autumn", "Rainy"};
		List<String> strAl = Arrays.asList(strarray);

		for (String i : strAl) {
			System.out.println(" ** " + i);
		}
	}

}
