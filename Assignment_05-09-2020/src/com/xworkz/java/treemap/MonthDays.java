package com.xworkz.java.treemap;

import java.util.TreeMap;

public class MonthDays {

	String monthname;
	int noofdays;

	public MonthDays(String monthname, int noofdays) {
		super();
		this.monthname = monthname;
		this.noofdays = noofdays;
	}

	public String getMonthname() {
		return monthname;
	}

	public int getNoofdays() {
		return noofdays;
	}

	public void setMonthname(String monthname) {
		this.monthname = monthname;
	}

	public void setNoofdays(int noofdays) {
		this.noofdays = noofdays;
	}

	@Override
	public String toString() {
		return "MonthDays [monthname=" + monthname + ", noofdays=" + noofdays + "]";
	}

	public static void main(String[] args) {
		TreeMap<String, Integer> months = new TreeMap<>();
		
		months.put("January", 31);
		months.put("February", 28);
		months.put("March", 31);
		months.put("April", 30);
		months.put("May", 31);
		
		months.forEach((m,d)-> System.out.println("Keys : " + m + " Values : " + d));
		
		System.out.println(months.keySet());
		
		System.out.println(months.values());
		
		
	}
}
