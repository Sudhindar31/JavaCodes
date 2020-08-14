package com.xworkz.java.interfaceconcept;

public abstract class AirtelInternetProvider implements InternetProvider{
	
	@Override
	public void transmittingspeed(){
		System.out.println("The transmitting speed is : 100mpbs ");
	}
	@Override
	public void connectivitytype(){
		System.out.println("The connectivity type is : Broadband ");
	}
}
