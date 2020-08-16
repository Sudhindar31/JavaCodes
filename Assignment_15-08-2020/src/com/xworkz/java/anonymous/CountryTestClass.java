package com.xworkz.java.anonymous;

public class CountryTestClass {

	public static void main(String[] args) {
		Country india = new Country() {

			@Override
			public void anthem() {
				System.out.println("Our National Anthem: Jana Gana Mana");
			}

			@Override
			public void flag() {
				System.out.println("Our National Flag: Tricolour Flag with Ashoka chakra in the middle");
			}

			@Override
			public void nationalAnimal() {
				System.out.println("Our National Animal: Tiger");
			}

		};
		india.anthem();
		india.flag();
		india.nationalAnimal();
	}

}
