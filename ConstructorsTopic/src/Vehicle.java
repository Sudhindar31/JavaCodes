
public class Vehicle {
	String regno;
	int noofwheels;
	String fueltype;

	public Vehicle() {

	}

	public Vehicle(String iregno, int inoofwheels, String ifueltype) {
		regno = iregno;
		noofwheels = inoofwheels;
		fueltype = ifueltype;
	}

	public Vehicle(String iregno) {
		regno = iregno;
	}

	public Vehicle(int inoofwheels, String ifueltype) {
		inoofwheels = noofwheels;
		ifueltype = fueltype;
	}

	void running() {
		System.out.println("Vehicle is running");
	}

	void applybrake() {
		System.out.println("Apply brakes");
	}

	public static void main(String[] args) {
		Vehicle car = new Vehicle();
		System.out.println("Registration number : " + car.regno + " Number of wheels : " + car.noofwheels
				+ " Fuel Type : " + car.fueltype);
		
		car.regno = "TN 11 AB 7932";
		car.noofwheels = 4;
		car.fueltype = "Petrol";
		System.out.println("Registration number : " + car.regno + " Number of wheels : " + car.noofwheels
				+ " Fuel Type : " + car.fueltype);
		
		Vehicle bike = new Vehicle("TN10 GH 4732",2,"Petrol");
		System.out.println("Registration number : " + bike.regno + " Number of wheels : " + bike.noofwheels
				+ " Fuel Type : " + bike.fueltype);
		
	}
}
