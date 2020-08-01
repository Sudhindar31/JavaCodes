package com.xworkz.java.gettersetter;

public class SanitizerTest {
	public static void main(String[] args) {
		Sanitizer s1 = new Sanitizer();
		s1.setAlchoholBased(true);
		s1.setPercentofAlchohol(77);
		s1.setSanitizerType("Chlorine based");
		
		s1.getalchoholbased();
		s1.getPercentofAlchohol();
		s1.getSanitizerType();
	}
}
