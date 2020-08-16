package com.xworkz.java.interfaceeg3;

public interface Int2 {
	
	String test = "Sample String";
	
	default void method1(){
		System.out.println("Int2 : Method 1");
	}
	default void method2(){
		System.out.println("Int2 : Method 2");
	}
}
