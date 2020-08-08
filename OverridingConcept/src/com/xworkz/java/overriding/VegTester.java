package com.xworkz.java.overriding;

public class VegTester {

	public static void main(String[] args) {

		Food f1 = new Food();
		System.out.println("Quantity in gms of the Food class : " + f1.quantityIngms);
		System.out.println();

		VegetarianFood veggie = new VegetarianFood();
		veggie.cuisinetype = "Mediterranian";

		veggie.cooking();
		veggie.veggies();

		System.out.println();
		System.out.println("Cuisine type : " + veggie.cuisinetype + " Quantity of food : " + veggie.quantityIngms);

		NonVegFood n1 = new NonVegFood();
		n1.nonvegfoodmethod();
		n1.cooking();
	}

}
