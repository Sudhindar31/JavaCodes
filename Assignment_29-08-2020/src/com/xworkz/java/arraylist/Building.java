package com.xworkz.java.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Building {

	String btypes;
	String size;
	String style;

	public String getBtypes() {
		return btypes;
	}

	public String getSize() {
		return size;
	}

	public String getStyle() {
		return style;
	}

	public void setBtypes(String btypes) {
		this.btypes = btypes;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public void setStyle(String style) {
		this.style = style;
	}
	
	public Building(String btypes, String size, String style) {
		super();
		this.btypes = btypes;
		this.size = size;
		this.style = style;
	}
	

	@Override
	public String toString() {
		return "Building [btypes=" + btypes + ", size=" + size + ", style=" + style + "]";
	}

	public static void main(String[] args) {

		List<Building> buildings = new ArrayList<>();
		
		buildings.add(new Building("Cathedral", "Big", "Church"));
		buildings.add(new Building("Mansion", "Medium", "Residential"));
		buildings.add(new Building("Skyscraper", "Tall", "Business"));
		buildings.add(new Building("Factory", "Huge", "Industrial"));
		
		/*for (Building b : buildings){
			System.out.println(b.toString());
		}*/
		
		
		//Display the last element
		System.out.println(buildings.get(buildings.size()-1).toString());
		
		//update the 3rd element with a new object.
		buildings.set(3, new Building("Stadium","Big","Sports"));
		System.out.println(buildings);
		
		//Add a new object at the index 0
		buildings.add(0, new Building("WindMill", "Medium", "PowerStation"));
		System.out.println(buildings);
		
		/*Collection<Building> build = buildings;
		for(Building b : build){
			System.out.println(b.toString());
		}*/
	}

}
