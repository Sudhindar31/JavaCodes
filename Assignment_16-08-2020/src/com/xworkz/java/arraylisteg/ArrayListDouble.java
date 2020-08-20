package com.xworkz.java.arraylisteg;

import java.util.ArrayList;

public class ArrayListDouble {

	public static void main(String[] args) {

		ArrayList<Double> dvalues = new ArrayList<Double>();

		dvalues.add(56.38);
		dvalues.add(57.43);
		dvalues.add(48.56);
		dvalues.add(94.23);
		dvalues.add(56.64);
		dvalues.add(286.31);
		dvalues.add(3484.38);

		System.out.println("The size of the ArrayList<Double> : " + dvalues.size());

		System.out.println("===========ForLoop==========");
		for (int i = 0; i < dvalues.size(); i++) {
			System.out.println(dvalues.get(i));
		}
		System.out.println("===========EnhancedForLoop==========");
		for (Double d : dvalues) {
			System.out.println("The values in the ArrayList<Double> are :" + d);
		}
		System.out.println("=========The Old value in the ArrayList<Double> for the index 3 is :" + dvalues.get(3));
		dvalues.set(3, 56.23);
		System.out.println("The new value of the index 3 is set to : " + dvalues.get(3));
		
		System.out.println("=========The Last value in the ArrayList<Double> is :" + dvalues.get(dvalues.size() - 1));

		dvalues.remove(0);
		System.out.println(dvalues.get(0));
		
		System.out.println("=========The value in the ArrayList<Double> are :");
		dvalues.forEach(s -> System.out.println(s));
		
		System.out.println(dvalues.remove(56.23));

		System.out.println("=========The value in the ArrayList<Double> afte removing the value 56.23 are :");
		dvalues.forEach(s -> System.out.println(s));
	}

}
