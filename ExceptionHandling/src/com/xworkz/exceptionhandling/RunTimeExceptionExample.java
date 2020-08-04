package com.xworkz.exceptionhandling;

public class RunTimeExceptionExample {

	public static void main(String[] args) {

		arraymanipulation();
	}

	static void arraymanipulation() {
		try {
			try {
				int num = Integer.parseInt("ADH");
				System.out.println(num);
			} catch (NumberFormatException e) {
				System.out.println("String cannot be converted to number");
			}
			int[] intArray = { 1, 2, 3, 4 };
			System.out.println("The fifth element is : " + intArray[4]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("The index doesn't exist");
		} catch (RuntimeException e) {
			System.out.println("Runtime exception");
		} catch (Exception e) {
			System.out.println("Exception occured");
		}
	}
}
