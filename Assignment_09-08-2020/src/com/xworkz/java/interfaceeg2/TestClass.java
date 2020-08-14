package com.xworkz.java.interfaceeg2;

public class TestClass extends AirCooler {

	String type = "Airconditioner";
	
	@Override
	public void coolstheroom() {
		System.out.println("TestClass : It cools the room");
	}
	public void removeswarmair() {
		System.out.println("TestClass : Removes warm air from the room");
	}
	public static void main(String[] args) {
		TestClass a = new TestClass();
		System.out.println(a.type);

		a.coolstheroom();
		a.removeswarmair();

		/*
		 * AirCooler b = new AirCooler(); b.coolstheroom(); b.removeswarmair();
		 */
	}
}
