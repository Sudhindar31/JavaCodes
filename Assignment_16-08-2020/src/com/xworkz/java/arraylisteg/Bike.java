package com.xworkz.java.arraylisteg;

public class Bike {
	
	String Model;
	
	Bike(String model){
		this.Model = model;
	}
	void displaybikeelements(){
		System.out.println(" The elements in the Array are : " + Model);
	}
	
	public static void main(String[] args) {

		Bike[] bikearray = new Bike[5];
		
		bikearray[0] = new Bike("Thunderbird X");
		bikearray[1] = new Bike("Gixer");
		bikearray[2] = new Bike("Street Twin");
		bikearray[3] = new Bike("Dominor");
		bikearray[4] = new Bike("Duke 390");
		

		for (int i = 0; i < bikearray.length; i++) {
			bikearray[i].displaybikeelements();
		}
	}

}
