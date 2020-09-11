package com.xworkz.java.threadconcepts.runnable;

import java.util.Arrays;
import java.util.List;

public class CollectSuffixPrefixTester {
	public static void main(String[] args) {
		System.out.println("The thread name : " + Thread.currentThread().getName() + "The id is : "
				+ Thread.currentThread().getId());

		// Thread using runnable interface
		CollectionSuffixPrefixT1 collT1 = new CollectionSuffixPrefixT1();
		Thread t1 = new Thread(collT1);
		t1.start();

		Runnable runnableT2 = new Runnable() {

			@Override
			public void run() {
				System.out.println("The thread name : " + Thread.currentThread().getName() + "The id is : "
						+ Thread.currentThread().getId());
				Integer[] intarray = { 1, 2, 3, 4, 5, 6 };
				List<Integer> intAl = Arrays.asList(intarray);

				for (int i : intAl) {
					System.out.println(" ** " + i);
					
				}
			}
		};

		Thread t2 = new Thread(runnableT2);
		t2.start();

		Runnable runnableT3 = () -> {

			System.out.println("The thread name : " + Thread.currentThread().getName() + "The id is : "
					+ Thread.currentThread().getId());
			Integer[] intarray = { 1, 2, 3, 4, 5, 6 };
			List<Integer> intAl = Arrays.asList(intarray);

			for (int i : intAl) {
				System.out.println(" *** " + i);
			}
		};

		Thread t3 = new Thread(runnableT3);
		t3.start();

		System.out.println("End of the thread : " + Thread.currentThread().getName() + "The id is : "
				+ Thread.currentThread().getId());
	}
}
