package com.xworkz.java.numberofinstanceforanobject;

public class Sport {

	String sportname;
	static String sporttype;
	Boolean isteamsport;
	static int count = 0;
	
	{
		count++;
	}
	
	Sport (){
		
	}
	public Sport(String asportname, Boolean aisteamsport) {
	sportname = asportname;
	isteamsport = aisteamsport;
	}

	static void notice() {
		sporttype = "indoor";
	}

	public static void main(String[] args) {
		Sport s1 = new Sport();
		s1.sportname = "Volleyball";
		s1.isteamsport = true;
		Sport.notice();
		System.out.println("Sportname : " + s1.sportname + " sporttype : " + sporttype + " Is it a team sport : "
				+ s1.isteamsport);

		Sport s2 = new Sport("Table Tennis", true);
		System.out.println("Sportname : " + s2.sportname + " sporttype : " + sporttype + " Is it a team sport : "
				+ s2.isteamsport);
		
		Sport s3 = new Sport("Basketball", true);
		System.out.println("Sportname : " + s3.sportname + " sporttype : " + sporttype + " Is it a team sport : "
				+ s3.isteamsport);
		
		System.out.println("The number of instances created for an object : " + count);
	}
}