package com.xworkz.java.hashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetChar {

	public static void main(String[] args) {

		LinkedHashSet<Character> character = new LinkedHashSet<>();

		character.add('H');
		character.add('o');
		character.add('p');
		character.add('e');
		character.add('i');
		character.add('s');
		character.add('E');
		character.add('v');
		character.add('E');
		character.add('r');
		character.add('Y');
		character.add('t');
		character.add('H');
		character.add('i');
		character.add('N');
		character.add('g');

		/*
		 * for (Character c : character){ System.out.println(c); }
		 */

		Iterator<Character> c = character.iterator();
		while (c.hasNext()) {
			System.out.println(c.next());
		}
	}

}
