package com.xworkz.java.anonymous.functionalinterface;

public class Tester {

	public static void main(String[] args) {
		NoArgumentFI test = () -> {

			System.out.println("Hello World");
		};
		test.printHello();		

		OneArgumentFI test1 = (a) -> (a + 5);
		System.out.println(test1.incrementByFive(5));

		MultiArgumentFI test2 = (a, b) -> (a + b);
		System.out.println(test2.ConcatTwoString("King", "dom"));
		
		

	}

}
