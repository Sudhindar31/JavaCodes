package com.xworkz.java.override;

public class Carnivores extends Animal{
	
	String size;
	
	void hunting(){
		System.out.println("These animals hunt other animals for food");
	}
	@Override
	void animalfood(){
		System.out.println("Carnivores : Some of these animals are hunted food and skin");
	}
	
	
}
