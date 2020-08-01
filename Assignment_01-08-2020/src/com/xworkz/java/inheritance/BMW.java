package com.xworkz.java.inheritance;

public class BMW extends Bike{

	void acceleratevehicle(){
		System.out.println("Accelerate the vehicle (BMW class)");
	}
	
	public static void main(String[] args) {
		BMW b1 = new BMW();
		b1.acceleratevehicle();
		b1.stopvehicle();
		
		Vehicle b2 = new BMW();
		b2.acceleratevehicle();
		b2.stopvehicle();
		
		Vehicle b3 = new Bike();
		b3.acceleratevehicle();
	}

}
