package com.xworkz.java.abstractclass;

public class LiftTester {

	public static void main(String[] args) {
			
		OtisLift o = new OtisLift();
		o.alarm();
		o.stop();
		o.press1();
		o.press2();
		
		Lift l = new OtisLift();
		
		SchindlerLift s = new Lift(); //downcasting
		
	}

}
