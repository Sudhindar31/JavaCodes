package com.xworkz.java.threaddelay;

public class ThreadSleepTester {

	public static void main(String[] args) {

		ThreadSleepEg thsleep = new ThreadSleepEg();
		Thread t1 = new Thread(thsleep);
		t1.start();
	}

}
