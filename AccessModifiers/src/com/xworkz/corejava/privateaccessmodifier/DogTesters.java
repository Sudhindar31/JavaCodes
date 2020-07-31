package com.xworkz.corejava.privateaccessmodifier;

public class DogTesters {

	public static void main(String[] args) {
		// Cannot access the private member of the Dog class, outside the class
		// Can access default members outside the class
		Dog dog2 = new Dog("Bull dog", 11);
		dog2.breed = "Bull dog";
		dog2.age = 5;
		dog2.color = "Black";
		dog2.isMale = true;

		System.out.println("Dog age : " + dog2.age);

		dog2.barking();
		dog2.eating();
		dog2.running();

	}

}
