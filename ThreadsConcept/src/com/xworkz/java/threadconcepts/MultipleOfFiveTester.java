package com.xworkz.java.threadconcepts;

public class MultipleOfFiveTester {

	public static void main(String[] args) {
		System.out.println("This is the main method");
		System.out.println("The name of the thread: "+ Thread.currentThread().getName());
		System.out.println("The id of the thread: "+ Thread.currentThread().getId());
		
		Thread.currentThread().setName("My Main Thread");
		System.out.println("The name of the thread: "+ Thread.currentThread().getName());
		
		MultiplesOfFiveT1 t1 = new MultiplesOfFiveT1();
		t1.start(); //Creating a thread
		
		MultiplesOfFiveT2 t2 = new MultiplesOfFiveT2();
		t2.start();
		
		System.out.println("End of the main method");
	}

}
