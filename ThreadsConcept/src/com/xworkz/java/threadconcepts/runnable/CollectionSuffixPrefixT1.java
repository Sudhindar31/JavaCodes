package com.xworkz.java.threadconcepts.runnable;

import java.util.Arrays;
import java.util.List;

public class CollectionSuffixPrefixT1 implements Runnable {

	@Override
	public void run() {

		Integer[] intarray = { 1, 2, 3, 4, 5, 6 };
		List<Integer> intAl = Arrays.asList(intarray);

		for (int i : intAl) {
			System.out.println(" * " + i);
		}
	}

}
