package com.xworkz.corejava.privateaccessmodifier;

public class Dog {

	private String breed;
	protected String color;
	int age;				//Default modifier
	public boolean isMale;
	
	//Constructors
	private Dog(){
		System.out.println("Creating object of the dog");
	}
	public Dog(String inbreed, int inage){
		System.out.println("Creating object of the dog");
	}
	Dog(String inbreed){
		breed = inbreed;
		System.out.println("Creating object of the dog using one parameter");
	}
	
	//Methods
	private void eating(){
		System.out.println("Dog will eat dog food");
	}
	void barking(){
		breed = "Labrador";
		System.out.println("Dog will bark");
	}
	public void running(){
		System.out.println("Dog will run");
	}
	public static void main(String[] args) {
		//can access all the private members with in the class
		
		Dog d1 = new Dog();
		d1.breed = "German Shepherd";
		d1.age = 15;
		
		d1.eating();
		d1.barking();
		
	}

}
