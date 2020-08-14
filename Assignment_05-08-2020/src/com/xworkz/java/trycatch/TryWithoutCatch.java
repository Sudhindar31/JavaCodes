package com.xworkz.java.trycatch;

public class TryWithoutCatch {

	public static void main(String[] args) {
		int i = 10, b = 0;

		try {
			int div = i / b;
		}
		// catch(ArithmeticException e){
		finally {
			System.out.println("The condition is incorrect");
		}
	}
}

// }
