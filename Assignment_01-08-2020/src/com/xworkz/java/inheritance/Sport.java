package com.xworkz.java.inheritance;

public class Sport {
	
	Boolean isteamgame;
	Boolean isoutdoorgame;
	int noofplayers;
	
	void teamgame(){
		System.out.println(" Is this a team game : " + isteamgame);
	}
	void players(){
		System.out.println(" No of players in the game : " + noofplayers);
	}
	void isoutdoorgame() {
		System.out.println(" parent class : Is it a outdoor game : " + isoutdoorgame);
	}
	
}
