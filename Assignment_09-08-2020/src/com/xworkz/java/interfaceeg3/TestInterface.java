package com.xworkz.java.interfaceeg3;

public class TestInterface implements Int1, Int2 {

	@Override
	public void method1() {
		System.out.println(" TestInterface : print Method1 ");

	}

	public void method2() {
		System.out.println(" TestInterface : print Method2 ");

	}
	public static void main(String[] args) {
		TestInterface test = new TestInterface();
		test.method1();
		test.method2();
		
		System.out.println(Int2.test);
		System.out.println(Int1.i);
	}
}
