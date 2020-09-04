package com.xworkz.java.priorityqeg;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueEg {

	public static void main(String[] args) {
		PriorityQueue<Double> db = new PriorityQueue<>();

		db.add(23.45);
		db.add(456.55);
		db.add(534.25);
		db.add(785.56);
		db.add(87.12);
		db.add(36.24);
		db.add(65.80);
		db.add(21.85);

		// retrieves and removes the head of this queue
		// System.out.println(db.poll());

		// insert the specified element into this queue
		// System.out.println(db.offer(53.93));

		// retrieves, but does not remove, the head of this queue or returns
		// null if this queue is empty
		// System.out.println(db.peek());

		// retrieves, but does not remove, the head of this queue and it throws
		// an exception if this queue is empty.
		System.out.println(db.element());

		Iterator<Double> d = db.iterator();
		while (d.hasNext()) {
			System.out.println(d.next());
		}

	}

}
