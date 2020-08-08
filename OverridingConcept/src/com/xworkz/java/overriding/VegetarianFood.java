package com.xworkz.java.overriding;

public class VegetarianFood extends Food{
	
	String cuisinetype;
	int quantityIngms = 300;
	
	void veggies(){
		System.out.println("Veggies method from VegetarianFood");
	}
	void cooking(){
		System.out.println("method ofthe VegetarianFood class");
	}
}
