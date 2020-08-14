package com.xworkz.java.abstractclass;

public abstract class Lift {
	
	public abstract void press1();
	
	public abstract void press2();
	
	void stop(){
		System.out.println("The lift has to halt as soon as the STOP button is pressed");
	}
	void alarm(){
		System.out.println("The lift has got stuck in the lift when the ALARM button is pressed");
	}
}
