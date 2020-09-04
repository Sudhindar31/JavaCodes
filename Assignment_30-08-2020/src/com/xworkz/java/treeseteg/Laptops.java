package com.xworkz.java.treeseteg;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Laptops {

	String brand;
	String processortype;
	
	public Laptops(String brand, String processortype) {
		super();
		this.brand = brand;
		this.processortype = processortype;
	}

	public String getBrand() {
		return brand;
	}

	public String getProcessortype() {
		return processortype;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setProcessortype(String processortype) {
		this.processortype = processortype;
	}

	@Override
	public String toString() {
		return "Laptops [brand=" + brand + ", processortype=" + processortype + "]";
	}

	public static void main(String[] args) {
		
/*		Comparator<Laptops> comp1= new Comparator<Laptops>() {
			
			@Override
			public int compare(Laptops o1, Laptops o2) {
				return o1.getProcessortype().compareTo(o2.getBrand());
			}
		};
*/
		Comparator<Laptops> comp1= (o1, o2) -> o1.getBrand().compareTo(o2.getProcessortype());
		
		TreeSet<Laptops> lp = new TreeSet<Laptops>(comp1);
		
		lp.add(new Laptops("Dell", "Intel i9"));
		lp.add(new Laptops("HP", "AMD Athlon"));
		lp.add(new Laptops("Lenovo", "Intel i7"));
		
		//System.out.println(lp);
		
		//for each
		
		/*for (Laptops l : lp){
			System.out.println(l);
		}*/
		
		Iterator<Laptops> listoflaptops = lp.iterator();
		
		while(listoflaptops.hasNext()){
			System.out.println(listoflaptops.next());
		}
	}

}
