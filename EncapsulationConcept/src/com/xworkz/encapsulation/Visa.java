package com.xworkz.encapsulation;

public class Visa {

	private int visanumber;
	private String vcountry;
	
	private void vdetails(){
		visanumber = 4872367;
		vcountry = "UK";
	}
	public void vdisplay (){
		
		System.out.println("The visa number is : " + visanumber);
		System.out.println("The visa country is : " + vcountry);
	}
	
	public static void main(String[] args) {
			Visa v1 = new Visa();
			v1.vdetails();
			v1.vdisplay();
	}

}
