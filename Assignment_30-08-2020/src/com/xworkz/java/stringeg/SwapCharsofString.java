package com.xworkz.java.stringeg;

public class SwapCharsofString {

	public static void main(String[] args) {
		String str = "Hello Folks";
		
		System.out.println(str.charAt(str.length()-1) + str.substring(1, str.length()-1) + str.charAt(0));
		
	}

}
