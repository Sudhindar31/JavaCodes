package com.xworkz.java.abstractclass;

public class Tester {

	public static void main(String[] args) {
			
		SBIBank s = new SBIBank();
		RBIBank r = new SBIBank(); //upcasting
		
		r.openBankAccount(); //runtime polymorphism
		s.openBankAccount();
	}

}
