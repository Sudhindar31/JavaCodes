package com.xworkz.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringEg {

	public static void main(String[] args) {
	
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		
		List<String> result = strings.stream().filter(s-> !s.isEmpty()).collect(Collectors.toList());
		
		System.out.println(result);
		
		List<String> result2 = strings.stream().filter(s-> s.isEmpty()).collect(Collectors.toList());
		
		System.out.println("The number of empty strings in the list : " + result2.size());
		
		List<String> result3 = strings.stream().filter(s-> s.length()==3).collect(Collectors.toList());
		
		System.out.println("The number of strings with 3 characters in the list are : " + result3);
	}

}
