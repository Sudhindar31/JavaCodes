package com.xworkz.staticmembers;

public class Doctor {
	
	String degree;
	String specialization;
	static String location; //global variable
	
	static{
		//initialization
	}
	
	public Doctor(String degree, String specialization) {
		this.degree = degree;
		this.specialization = specialization;
	}
	static void location(){
		location = "USA";
	}
	
	void display(){
		System.out.println("" + degree);
		System.out.println("" + specialization);
		System.out.println("" + location);
	}
	
}
