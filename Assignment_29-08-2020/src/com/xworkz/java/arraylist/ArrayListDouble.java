package com.xworkz.java.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDouble {

	public static void main(String[] args) {
		
		ArrayList<Double> darraylist = new ArrayList<>();
		
		darraylist.add(20.00);
		darraylist.add(40.00);
		darraylist.add(30.00);
		darraylist.add(10.00);
		darraylist.add(56.00);
		darraylist.add(67.00);
		darraylist.add(46.00);
		darraylist.add(35.00);
		darraylist.add(375.00);
		darraylist.add(1940.00);
		
		//ascending order
		Collections.sort(darraylist);
		System.out.println(darraylist);
		
		//descending order
		Collections.sort(darraylist, Collections.reverseOrder());
		System.out.println(darraylist);

	}

}
