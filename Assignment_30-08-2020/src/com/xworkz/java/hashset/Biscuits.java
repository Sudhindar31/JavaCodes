package com.xworkz.java.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class Biscuits {

	String company;
	String type;
	double price;

	public Biscuits(String company, String type, double price) {
		super();
		this.company = company;
		this.type = type;
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public String getType() {
		return type;
	}

	public double getPrice() {
		return price;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Biscuits [company=" + company + ", type=" + type + ", price=" + price + "]";
	}

	public static void main(String[] args) {
		HashSet<Biscuits> biscuit = new HashSet<>();

		biscuit.add(new Biscuits("Britannia Good day", "cookie", 25.00));
		biscuit.add(new Biscuits("Nabisco Oreo", "Sandwich cookie", 45.00));
		biscuit.add(new Biscuits("Parle Hide and Seek", "Chocolate chip cookie", 35.00));
		biscuit.add(new Biscuits("Sunfeast digestive", "digestive hi-fibre cookies", 30.00));

		/*for (Biscuits b : biscuit) {
			System.out.println(b);
		}*/
		
		Iterator<Biscuits> b = biscuit.iterator();
		while(b.hasNext()){
			System.out.println(b.next());
		}
	}

}
