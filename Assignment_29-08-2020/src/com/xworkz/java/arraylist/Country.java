package com.xworkz.java.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Country implements Comparable<Country> {

	int noofstates;
	String name;
	int countrycode;

	public int getNoofstates() {
		return noofstates;
	}

	public String getName() {
		return name;
	}

	public int getCountrycode() {
		return countrycode;
	}

	public void setNoofstates(int noofstates) {
		this.noofstates = noofstates;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCountrycode(int countrycode) {
		this.countrycode = countrycode;
	}

	public Country(int noofstates, String name, int countrycode) {
		super();
		this.noofstates = noofstates;
		this.name = name;
		this.countrycode = countrycode;
	}

	@Override
	public String toString() {
		return "Country [noofstates=" + noofstates + ", name=" + name + ", countrycode=" + countrycode + "]";
	}

	public static void main(String[] args) {
		
		List<Country> countries = new ArrayList<>();
		
		countries.add(new Country(28,"India", 91));
		countries.add(new Country(50, "USA", 1));
		countries.add(new Country(47,"Japan", 81));
		countries.add(new Country(16, "Germany", 49));
		countries.add(new Country(10, "Canada", 1));
		Collections.sort(countries);
		
		
		Collections.sort(countries, Collections.reverseOrder());
		for(Country c : countries){
			System.out.println(c);
		}
	}

	@Override
	public int compareTo(Country o) {
		if(this.noofstates == o.noofstates)  
		      return 0;  
		   else if(this.noofstates>o.noofstates)  
		      return 1;  
		   else  
		      return -1;  
	}

}
