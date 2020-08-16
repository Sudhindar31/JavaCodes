package com.xworkz.java.anonymousclass;

public class MathOperationTester {

	public static void main(String[] args) {
		MathOperation test = new MathOperation(){
			@Override
			public int add(int a, int b) {
				int sum = a+b+5; 
				System.out.println(sum);
				return sum;
			}

			@Override
			public int sub(int a, int b) {
				int diff = a-b-5; 
				System.out.println(diff);
				return diff;
			}
		};
		test.add(5, 10);
		test.sub(20, 10);
		MathOperation test2 = new MathOperation(){
			@Override
			public int add(int a, int b) {
				int sum = a+b+10; 
				System.out.println(sum);
				return sum;
			}

			@Override
			public int sub(int a, int b) {
				int diff = a-b-10; 
				System.out.println(diff);
				return diff;
			}
		};
	test2.add(5, 10);
	test2.sub(20, 10);
	}
}
