package com.xworkz.exceptionhandling;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
			int x = 10, y = 0;
			String name = null;
			
			
			try{
				int div = x/y;
				System.out.println("The result is : " + div);	
			}catch(ArithmeticException e){
				System.out.println("You have entered Zero as divisor, please enter a different value");
			}
			try{
				int length = name.length();
			}catch (Exception e){
				System.out.println("Please enter a name");
			}
			Dog dog = null;
			try{
				dog.running();
			}catch (NullPointerException e){
				System.out.println("Initialize the Object Dog before using");
			}
			dog = new Dog ("German Shepherd");
			dog.barking();
	}

}
