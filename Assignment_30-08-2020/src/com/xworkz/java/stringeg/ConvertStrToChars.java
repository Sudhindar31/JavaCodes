package com.xworkz.java.stringeg;

import java.util.ArrayList;
import java.util.List;

public class ConvertStrToChars {

	public static void main(String[] args) {
		String str = "Hello people how are you ?";

		// convert the str to character array
		char[] s = str.toCharArray();

		// empty list to store characters
		List<Character> ch = new ArrayList<>();

		for (char c : s) {
			ch.add(c);
		}
		System.out.println(ch);
		
		
		String str1 = "";
		
		for (char r : ch){
			str1 += r;
		}
		System.out.println(str1);
	}

}
