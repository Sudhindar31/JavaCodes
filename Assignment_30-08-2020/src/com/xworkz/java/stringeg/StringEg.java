package com.xworkz.java.stringeg;

public class StringEg {

	public static void main(String[] args) {
		String str = "Mickcheck 123 123 !!";

		String result = str.chars().allMatch(Character::isLetter) ? "Yes" : "No";

		System.out.println("'Mick check 123 123 !!' contains alphabets only? " + result);
	}

}
