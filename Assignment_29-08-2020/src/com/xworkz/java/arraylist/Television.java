package com.xworkz.java.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Television {
	
	String brand;
	int inches;
	String type;
	
	public String getBrand() {
		return brand;
	}

	public int getInches() {
		return inches;
	}

	public String getType() {
		return type;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setInches(int inches) {
		this.inches = inches;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public Television(String brand, int inches, String type) {
		super();
		this.brand = brand;
		this.inches = inches;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Television [brand=" + brand + ", inches=" + inches + ", type=" + type + "]";
	}

	public static void main(String[] args) {
		
		List<Television> tv = new ArrayList<>();
		
		tv.add(0, new Television("Samsung", 102, "QLED"));
		tv.add(1, new Television("LG", 80, "OLED"));
		tv.add(2, new Television("OnePlus", 43, "UHD"));
		tv.add(3, new Television("VU", 58, "LED"));
		tv.add(4, new Television("MI", 69, "LCD"));
		
		//Sort the elements by inches in ascending order.
		Collections.sort(tv, new TelevisionTester().reversed());
		for (Television t : tv){
			System.out.println(t);
		}
		//Sort the elements by brand in decending order.
		//Collections.sort(tv, new TelevisionTester().reversed());
		
	}
}
