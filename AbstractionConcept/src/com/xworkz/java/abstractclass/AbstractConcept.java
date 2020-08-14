package com.xworkz.java.abstractclass;

public abstract class AbstractConcept {
	
	public void myMethod(){
		//concrete or complete
	}
	public abstract void myAbstMethod(int a, int b); //Abstract //incomplete
	
	public static void main(String[] args) {
		
		//cannot instantiate
		//AbstractConcept abconcept = new AbstractConcept();	
		//abconcept.myAbstMethod(10, 20);
	}
}
