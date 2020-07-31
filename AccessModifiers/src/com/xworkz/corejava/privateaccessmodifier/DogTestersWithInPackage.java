package com.xworkz.corejava.privateaccessmodifier;

public class DogTestersWithInPackage {

	public static void main(String[] args) {
		//can access all the default and protected members of the dog
		//outside the class but inside the same package
		Dog dog = new Dog("Golden Retriever");
		
		dog.age = 13;
		dog.barking();
	}

}
