package com.xworkz.java.collectionfw.arraylist;

import java.util.ArrayList;

public class EvenNumbersArrayList {
	
	public static void main(String[] args) {
		
	ArrayList <Integer> evennumbers = new ArrayList<Integer>();
	
	System.out.println("Is the ArrayList empty ? :" + evennumbers.isEmpty());
	
	evennumbers.add(2);   //add(Integer in)  // add(new Integer(2))
	evennumbers.add(4);
	evennumbers.add(6);
	evennumbers.add(98);
	evennumbers.add(10);
	evennumbers.add(12);
	evennumbers.add(100);
	evennumbers.add(8);
	evennumbers.add(98);
	evennumbers.add(100);
	
	System.out.println("The element in the index 2 is : " + evennumbers.get(2));
	//evennumbers.set(2, 44);
	System.out.println(evennumbers);
	
	System.out.println("The size of the arraylist <evennumbers> is : " + evennumbers.size());
	
	for (int i=0; i<evennumbers.size(); i++){
		System.out.println(evennumbers.get(i));
	}
	
	for (Integer n : evennumbers){
		System.out.println("   " + n + "   ");
	}
	
	System.out.println(evennumbers.contains(98));
	
	System.out.println(evennumbers.lastIndexOf(100));
	
	System.out.println(evennumbers.remove(new Integer(6)));
	
	System.out.println("The evennumber list " + evennumbers);
	
	//System.out.println(evennumbers.remove(4));
	
	//System.out.println("The evennumber list " + evennumbers);
	
	//evennumbers.addAll(flowers);
}
}
