package com.xworkz.java.collectionfw.arraylist;

import java.util.ArrayList;

public class StringArrayList {

	public static void main(String[] args) {
		ArrayList <String> flowers = new ArrayList<String>();
		
		System.out.println("Is the ArrayList empty ? :" + flowers.isEmpty());
		flowers.add("Rose");
		flowers.add("Lilly");
		flowers.add("Hibiscus");
		
		flowers.add("Rose"); //duplicates are allowed
		flowers.add("Lilly");
		
		System.out.println("The element in the index 2 is : " + flowers.get(2));
		flowers.set(2, "Jasmine");
		System.out.println(flowers);
		
		System.out.println("The size of the arraylist <flowers> is : " + flowers.size());
		
		for (int i=0; i<flowers.size(); i++){
			System.out.println(flowers.get(i));
		}
		
		for (String s : flowers){
			System.out.println("   " + s + "   ");
		}
		//Create new ArrayList<String> SubArrayList
		//flowers.addAll(SubArrayList);
		
		System.out.println(flowers.contains("Jasmine"));
		
		System.out.println(flowers.lastIndexOf("Lilly"));
	}

}
