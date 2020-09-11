package com.xworkz.java.threads;

public class ThreadEgTester {

	public static void main(String[] args) {
		
		ThreadEgInteger thint = new ThreadEgInteger();
		Thread th1 = new Thread(thint);
		th1.start();
		
		ThreadEgString thstr = new ThreadEgString();
		Thread th2 = new Thread(thstr);
		th2.start();
		
		ThreadEgDouble thdouble = new ThreadEgDouble();
		Thread th3 = new Thread(thdouble);
		th3.start();
	}

}
