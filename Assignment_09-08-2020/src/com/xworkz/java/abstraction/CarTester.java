package com.xworkz.java.abstraction;

public class CarTester extends Audi{

	public static void main(String[] args) {
		Car c = new BMW();//downcasting
		c.applyAccelerator();
		c.applyBreak();
		c.turnSteeringToLeft();
		c.turnSteeringToRight();
		
		Car b = new Audi();
		b.applyBreak();
		b.applyAccelerator();
	}

}
