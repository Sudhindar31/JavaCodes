package com.xworkz.java.inheritance;

public class SportTest {

	public static void main(String[] args) {
		Cricket s1 = new Cricket();
		s1.isteamgame = true;
		s1.noofplayers = 11;
		s1.typeofmatch = "T20 match";
		s1.isoutdoorgame = true;
		
		s1.teamgame();
		s1.players();
		s1.matchtype();
		s1.isoutdoorgame();
	}

}
