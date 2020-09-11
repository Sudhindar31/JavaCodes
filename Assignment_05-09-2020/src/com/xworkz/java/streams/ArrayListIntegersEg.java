package com.xworkz.java.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class ArrayListIntegersEg {

	public static void main(String[] args) {
		
		List<Integer> integers = Arrays.asList(1,2,13,4,15,6,17,8,19);
		
		System.out.println("The numbers in the arraylist : " + integers);
				
		Integer maxnumber = integers.stream().max(Integer::compare).get();
		Integer minnumber = integers.stream().min(Integer::compare).get();
		
		System.out.println("Max Number available is :"+maxnumber);
		System.out.println("Min Number available is :"+minnumber);
		
		Integer sumofnumbers = integers.stream().mapToInt(Integer::intValue).sum();
		System.out.println("Sum of the numbers in the list is : " + sumofnumbers);
		
		Double avgofnumbers = integers.stream().mapToDouble(Integer::intValue).average().getAsDouble();
		System.out.println("Average of the numbers in the list is : " + avgofnumbers);
		
		List<Integer> squareofnums = integers.stream().map(s-> (s*s)).collect(Collectors.toList());
		System.out.println("The square of the numbers in the array list are : " + squareofnums);
		
	}

}
