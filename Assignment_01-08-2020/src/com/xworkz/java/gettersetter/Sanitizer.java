package com.xworkz.java.gettersetter;

public class Sanitizer {

	boolean isAlchoholbased;
	int percentageofalchohol;
	String sanitizertype;

	public void setAlchoholBased(boolean inputisAlchoholbased) {
		isAlchoholbased = inputisAlchoholbased;
	}

	public void getalchoholbased() {
		System.out.println(" Is the Sanitizer Alchohol based : " + isAlchoholbased);
	}

	void setPercentofAlchohol(int inputpercentageofalchohol) {
		percentageofalchohol = inputpercentageofalchohol;
	}

	void getPercentofAlchohol() {
		System.out.println(" Percentage of Alchohol in the Sanitizer is : " + percentageofalchohol);
	}

	protected void setSanitizerType(String inputsanitizertype) {
		sanitizertype = inputsanitizertype;
	}

	protected void getSanitizerType() {
		System.out.println(" The type of Sanitizer : " + sanitizertype);
	}
}