package com.xworkz.java.defaultaccessmodifier;

import com.xworkz.corejava.privateaccessmodifier.*;

public class TestDefaultModifiers {

	public static void main(String[] args) {
		//cannot access default or protected members of the class Dog outside the class
		//and in different package
		//But can access public members
		Dog dog = new Dog("Dalmation", 0);
		
		dog.age = 15;
		dog.isMale = false;
		
		dog.barking();
		dog.eating();
		dog.running();
	}

}
