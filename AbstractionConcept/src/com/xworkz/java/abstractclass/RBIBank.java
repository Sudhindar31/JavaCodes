package com.xworkz.java.abstractclass;

public abstract class RBIBank {
	
	abstract void openBankAccount();
	
	void deposit(int amount){
		System.out.println("Deposit Amount : " + amount);
	}
	void withdraw(int amount){
		System.out.println("Withdraw Amount : " + amount);
	}
}
