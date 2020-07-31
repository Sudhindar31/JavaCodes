package com.xworkz.staticmembers;

public class DoctorTester {

	public static void main(String[] args) {
		System.out.println("Location is " + Doctor.location);
		Doctor.location();
		
		Doctor doc1 = new Doctor("MBBS MD Cardiology", "Cardiology");
		doc1.display();
		Doctor doc2 = new Doctor("MBBS D.Ortho", "Orthopedic");
		doc2.display();
	}

}
