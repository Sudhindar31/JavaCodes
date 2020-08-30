package com.xworkz.java.arraylist;

import java.util.Comparator;

public class TelevisionTester implements Comparator<Television>{
	
	@Override
	public int compare(Television o1, Television o2) {
		int brand = o1.brand.compareTo(o2.brand);
		int type = o1.type.compareTo(o2.type);
		//return brand;
		//o1.inches - o2.inches;
		return type;
	}

}