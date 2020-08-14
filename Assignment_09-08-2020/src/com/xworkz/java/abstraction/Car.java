package com.xworkz.java.abstraction;

public abstract class Car {

	public void applyAccelerator() {
		System.out.println("Car class: Apply accelerator");
	}

	abstract void applyBreak();

	void turnSteeringToRight() {
		System.out.println("Car class: turn right");
	}

	void turnSteeringToLeft() {
		System.out.println("Car class: turn left");
	}
}
