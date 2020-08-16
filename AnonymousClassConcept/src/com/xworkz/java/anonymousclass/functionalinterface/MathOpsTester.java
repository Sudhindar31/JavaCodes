package com.xworkz.java.anonymousclass.functionalinterface;

public class MathOpsTester {

	public static void main(String[] args) {
		
		MathOps addtest = (a,b) -> a+b;
		System.out.println("The sum is :" + addtest.ops(10,50));
		
		MathOps subtest = (c,d) -> c-d;
		System.out.println("The diff is :" + subtest.ops(50,10));
		
		MathOps multest = (e,f) -> e*f;
		System.out.println("The sum is :" + multest.ops(30,35));
}
}