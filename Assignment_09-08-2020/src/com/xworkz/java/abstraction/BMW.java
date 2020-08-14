package com.xworkz.java.abstraction;

public class BMW extends Car{
	
	@Override
	public	void applyAccelerator(){
		System.out.println("BMW class: ApplyAccelerator");
	}
	@Override
	public	void applyBreak(){
		System.out.println("BMW class: ApplyBreak");
	}
	@Override
	public	void turnSteeringToRight(){
		System.out.println("BMW class: steer right");
	}
	@Override
	public	void turnSteeringToLeft(){
		System.out.println("BMW class: steer left");
	}
}
