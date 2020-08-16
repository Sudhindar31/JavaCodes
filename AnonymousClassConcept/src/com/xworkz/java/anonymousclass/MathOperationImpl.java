package com.xworkz.java.anonymousclass;

public class MathOperationImpl implements MathOperation{

	@Override
	public int add(int a, int b) {
		int sum = a+b; 
		System.out.println(sum);
		return sum;
	}

	@Override
	public int sub(int a, int b) {
		int diff = a-b; 
		System.out.println(diff);
		return diff;
	}

}
