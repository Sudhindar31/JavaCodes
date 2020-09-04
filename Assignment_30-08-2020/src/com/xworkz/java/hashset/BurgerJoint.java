package com.xworkz.java.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class BurgerJoint {
	
	public static void main(String[] args) {
		HashSet<String> bjoint = new HashSet<>();
		
		bjoint.add("Mcdonalds");
		bjoint.add("BurgerKing");
		bjoint.add("KFC");
		bjoint.add("BurgerMan");
		bjoint.add("FiveGuys");
		
		/*for(String s : bjoint){
			System.out.println(s);
		}*/
		
		Iterator<String> b = bjoint.iterator();
		while (b.hasNext()){
			System.out.println(b.next());
		}
	}

}
