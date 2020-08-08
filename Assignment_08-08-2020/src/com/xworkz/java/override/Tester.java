package com.xworkz.java.override;

public class Tester extends Herbivores{

	public static void main(String[] args) {
		Animal a = new Animal();
		a.category = "Domestic";
		a.size = "medium sized animal";
		a.eating();
		a.animalfood();
		
		Carnivores c = new Carnivores();
		c.size = "large sized animal";
		c.hunting();
		c.animalfood();
		
		Herbivores h = new Herbivores();
		h.size = "small sized animal";
		h.consumefood();
		h.animalfood();
		
		Tester t = new Tester();
		t.animalfood();
		
	}

}
