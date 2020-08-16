package com.xworkz.java.interfaceeg3;

public interface Int1 {
	
	int i = 100;
	
	default void method1(){
		System.out.println("Int1 : Method 1");
	}
	default void method2(){
		System.out.println("Int1 : Method 2");
	}
}
