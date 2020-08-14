package com.xworkz.java.abstraction;

public class Audi extends Car {

	@Override
	void applyBreak() {
		System.out.println("Audi class : Apply break");
	}
	@Override
	void turnSteeringToLeft() {
		System.out.println("Audi class : steer left");
	}
}
