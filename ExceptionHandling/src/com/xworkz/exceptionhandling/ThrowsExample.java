package com.xworkz.exceptionhandling;

public class ThrowsExample {

	public static void main(String[] args) {
		int a = 10, b = 0;
		ThrowsExample divopr = new ThrowsExample();

		try {
			int result = divopr.division(10, 0);
			System.out.println("Result is : " + result);
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic exception occured");
		}
	}

	int division(int a, int b) throws ArithmeticException{
		int div = a / b;
		return div;
	}

}
