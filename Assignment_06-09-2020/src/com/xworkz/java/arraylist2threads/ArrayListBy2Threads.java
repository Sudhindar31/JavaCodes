package com.xworkz.java.arraylist2threads;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListBy2Threads {

	
	static Integer[] intarray = { 1, 2, 3, 4, 5, 6 };
	static List<Integer> intAl = Arrays.asList(intarray);
	
	public static synchronized List<Integer> getList(){
		return intAl;
	}


	public static void main(String[] args) throws InterruptedException {
		
		Runnable test = new Runnable() {

			@Override
			public void run() {

				/*
				 * for (int i : intAl) { System.out.println(" * " + i); }
				 */
				getList().forEach(s -> System.out.println(" * " + s));
			}
		};

		Runnable test1 = new Runnable() {

			@Override
			public void run() {

				/*
				 * for (int i : intAl) { System.out.println(" * " + i); }
				 */

				getList().forEach(s -> System.out.println(" ** " + s));
			}
		};
		Thread th1 = new Thread(test);
		th1.start();
		/*Thread.sleep(3000);*/

		Thread th2 = new Thread(test1);
		th2.start();
	}
}