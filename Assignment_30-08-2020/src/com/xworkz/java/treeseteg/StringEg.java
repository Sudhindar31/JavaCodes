package com.xworkz.java.treeseteg;

import java.util.Iterator;
import java.util.TreeSet;

public class StringEg {

	String carbrands;

	public static void main(String[] args) {

		TreeSet<String> str = new TreeSet<String>();

		str.add("AUDI");
		str.add("Ferrari");
		str.add("BMW");
		str.add("Maserati");
		str.add("FORD");

		/*
		 * for (String s : str) { System.out.println(s); }
		 */

		//Iterator<String> s = str.iterator();

		// Iterator<String> s = str.descendingIterator();

		Iterator<String> s = str.iterator();
		while (s.hasNext()) {
			System.out.println(s.next());
		}
		//s.forEachRemaining(s1 -> System.out.println(s1));
		//System.out.println(s.hashCode());
	}

}
