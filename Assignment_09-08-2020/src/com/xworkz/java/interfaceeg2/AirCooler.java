package com.xworkz.java.interfaceeg2;

public abstract class AirCooler implements AirConditioner {
	
	abstract public void coolstheroom();

	public void removeswarmair() {
		System.out.println("AirCooler : Removes warm air from the room");
	}

}
