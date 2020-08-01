package com.xworkz.java.encapsulation;

public class LaptopTest {

	public static void main(String[] args) {
		Laptop l1 = new Laptop("chromebook");
		l1.processor = "intel core i9";
		l1.ram = 16;
		l1.graphiccard = "NVIDIA GTX 1080";

		l1.portability();
		l1.performance();

	}

}
