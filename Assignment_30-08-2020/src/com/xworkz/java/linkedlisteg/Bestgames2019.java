package com.xworkz.java.linkedlisteg;

import java.util.LinkedList;

public class Bestgames2019 {

	public static void main(String[] args) {
		LinkedList<String> bgames = new LinkedList<>();
		
		bgames.add("Tom Clancy's The Division 2");
		bgames.add("Kingdom Hearts 3");
		bgames.add("Mortal Kombat 11");
		bgames.add("Borderlands 3");
		bgames.add("Madden NFL 20");
		
		bgames.offer("Star wars Jedi: Fallen Order");
		bgames.addLast("Anthem");
		bgames.addFirst("Call of Duty: Modern Warfare");
		
		
		//System.out.println(bgames);
		
		/*Iterator<String> iterator = bgames.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}*/
		
		/*ListIterator<String> listiterator = bgames.listIterator();
		while(listiterator.hasNext())
		{
			System.out.println(listiterator.next());
		}
		
		System.out.println("==============================");
		
		while(listiterator.hasPrevious())
		{
			System.out.println(listiterator.previous());
		}*/
		
		/*System.out.println(bgames.getFirst());
		
		System.out.println(bgames.getLast());
		
		System.out.println(bgames.peek());*/
		
		//System.out.println(bgames.element());
		
		//System.out.println(bgames.remove());
		
		//System.out.println(bgames.removeAll(bgames));
		
		//System.out.println(bgames.getFirst());
		
		System.out.println(bgames.pollLast());
		
		System.out.println(bgames);
		
	}

}
