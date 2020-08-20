package com.xworkz.java.arraylisteg;

import java.util.ArrayList;

public class ArrayListChar {

	public static void main(String[] args) {

		ArrayList<Character> charvalues = new ArrayList<Character>();

		charvalues.add('A');
		charvalues.add('R');
		charvalues.add('E');
		charvalues.add('Z');
		charvalues.add('Q');
		charvalues.add('G');
		
		
		boolean ifALcontainselements = charvalues.containsAll(charvalues);
		System.out.println("The ArrayList charvalues contains elements : " + ifALcontainselements);
		
		System.out.println("===========ForLoop==========");
		for (int i = 0; i < charvalues.size(); i++) {
			System.out.println(charvalues.get(i));
		}
		System.out.println("===========EnhancedForLoop==========");
		for (Character c : charvalues) {
			System.out.println("The values in the ArrayList<Double> are :" + c);
		}
		
		charvalues.set(0, 'Z');
		System.out.println("The updated arraylist of charvalues is : " + charvalues);
	
		System.out.println("The 5th elements in arraylist of charvalues is : " + charvalues.get(4));
		
		charvalues.remove(2);
		System.out.println("The updated arraylist of charvalues is : " + charvalues);
		
		String v = "";
		for (int i=0; i<charvalues.size(); i++){
				if (charvalues.get(i) == 'Z'){
						v+=i + ",";
				}
		}
		System.out.println("The ArrayList contains the element Z at index positions : " + v);
		
		charvalues.removeIf(c -> c.equals('Z'));
		System.out.println("The updated arraylist of charvalues is : " + charvalues);
	}

}
