package com.xworkz.java.overriding;

public class NonVegFood extends VegetarianFood {

	int quantityIngms = 400;

	void cooking() {
		System.out.println("method ofthe NonVegFood class");
	}

	void nonvegfoodmethod() {
		System.out.println("Method of the NonVegFood class and nonvegfoodmethod");
	}

}
