package com.xworkz.java.encapsulation;

public class Laptop {

	public String processor;
	public String laptoptype;
	int ram;
	String graphiccard;

	Laptop(String ilaptoptype) {
		laptoptype = ilaptoptype;
	}

	Laptop(int iram, String igraphiccard, String iprocessor) {
		ram = iram;
		graphiccard = igraphiccard;
		processor = iprocessor;
	}

	public void portability() {

		System.out.println(" The type of laptop : " + laptoptype);
	}

	public void performance() {
		System.out.println(" The performance of the laptop depends on : " + " RAM - " + ram + " GB, "
				+ " Graphic card - " + graphiccard + ", Processor - " + processor);
	}

}
