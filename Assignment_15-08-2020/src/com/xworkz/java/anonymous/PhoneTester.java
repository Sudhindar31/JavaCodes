package com.xworkz.java.anonymous;

public class PhoneTester {

	public static void main(String[] args) {
		
		Phone smartphone = new Phone() {
			
			@Override
			public void gaming() {
				System.out.println("Smartphone: Method gaming");
			}
			
			@Override
			public void calling() {
				System.out.println("Smartphone: Method calling");
			}
		};
		
		smartphone.calling();
		smartphone.gaming();
		
		Phone keypadphone = new Phone() {
			
			@Override
			public void gaming() {
				System.out.println("Keypadphone: Method gaming");
				
			}
			
			@Override
			public void calling() {
				System.out.println("Keypadphone: Method gaming");
				
			}
		};
		keypadphone.calling();
		keypadphone.gaming();
}
}