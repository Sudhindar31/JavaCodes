package com.xworkz.java.override;

public class Herbivores extends Carnivores{
	
	String size;
	String behaviour;
	
	void consumefood(){
		System.out.println("These animals eat plant-based food only");
	}
	@Override
	void animalfood(){
		System.out.println("Herbivores : Some of these animals are hunted food and skin");
	}
	
	
}
