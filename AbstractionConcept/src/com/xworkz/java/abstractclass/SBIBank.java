package com.xworkz.java.abstractclass;

public class SBIBank extends RBIBank{
	
	@Override
	void openBankAccount(){
		System.out.println("Documents required to open account are : ");
		System.out.println("Pancard, Photos");
}
}