package com.xworkz.java.linkedhashmap;

import java.util.LinkedHashMap;

public class AreaZipcode {

	int zipcode;
	String nameofthearea;

	public AreaZipcode(int zipcode, String nameofthearea) {
		super();
		this.zipcode = zipcode;
		this.nameofthearea = nameofthearea;
	}

	public int getZipcode() {
		return zipcode;
	}

	public String getNameofthearea() {
		return nameofthearea;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public void setNameofthearea(String nameofthearea) {
		this.nameofthearea = nameofthearea;
	}

	@Override
	public String toString() {
		return "AreaZipcode [zipcode=" + zipcode + ", nameofthearea=" + nameofthearea + "]";
	}

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> az = new LinkedHashMap<>();
		
		az.put(600089, "Ramapuram");
		az.put(600034, "Nungambakkam");
		az.put(600056, "Porur");
		az.put(600017, "T.Nagar");
		az.put(602003, "Tiruvallur");
		
		System.out.println("Keys :" + az.keySet());
		
		System.out.println("Values :" + az.values());
		
		az.forEach((k,v)->System.out.println("Key : " + k + " Value : " + v));
		
		
	}
}
