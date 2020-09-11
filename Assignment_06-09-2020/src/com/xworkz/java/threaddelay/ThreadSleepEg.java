package com.xworkz.java.threaddelay;

import java.util.Arrays;
import java.util.List;

public class ThreadSleepEg implements Runnable {

	@Override
	public void run() {
		String[] strarray = { "Summer", "Winter", "Spring", "Autumn", "Rainy" };
		List<String> strAl = Arrays.asList(strarray);

		for (String i : strAl) {

			System.out.println(" ** " + i);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
