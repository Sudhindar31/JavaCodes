package com.xworkz.java.staticblocks;

public class MultipleStaticBlocks {

	static int num1, num2;

	static {
		num1 = 85;
		num2 = 74;
		System.out.println("The 1st number is : " + num1);
		System.out.println("The 2nd number is : " + num2);
	}

	static void print1(){
		System.out.println("The 1st number is : " + num1);
	}
	MultipleStaticBlocks(){
		System.out.println("The 2nd number is : " + num2);
	}
	
	public static void main(String[] args) {
		//MultipleStaticBlocks m = new MultipleStaticBlocks();
		
	}

}
