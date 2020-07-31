
public class Bike {

	String brand, model, fuelcapacity;
	double power, torque;

	/*Bike() {
		System.out.println("350cc category Bikes");
		System.out.println("=====================");
	}*/

	void startbike() {
		System.out.println("Turn on the ignition of the bike");
	}

	void accelerate() {
		System.out.println("Accelerate the vehicle");
	}

	void applybrakes() {
		System.out.println("Apply brakes");
	}

	void stopbike() {
		System.out.println("Turn off the ignition");
	}

	public static void main(String[] args) {
		Bike cruiser = new Bike();
		cruiser.brand = "Royal Enfield";
		cruiser.model = "Thunderbird 350";
		cruiser.fuelcapacity = "20L";
		cruiser.power = 19.8;
		cruiser.torque = 28;
		
		Bike sports = new Bike();
		sports.brand = "Kawasaki";
		sports.model = "Ninja 300";
		sports.fuelcapacity = "17L";
		sports.power = 38.4;
		sports.torque = 27;
		
		System.out.println("Brand : " + cruiser.brand);
		System.out.println("Model : " + cruiser.model);
		System.out.println("FuelCapacity : " + cruiser.fuelcapacity);
		System.out.println("Power : " + cruiser.power);
		System.out.println("Torque : " + cruiser.torque);
		System.out.println();
		
		System.out.println("Brand : " + sports.brand);
		System.out.println("Model : " + sports.model);
		System.out.println("FuelCapacity : " + sports.fuelcapacity);
		System.out.println("Power : " + sports.power);
		System.out.println("Torque : " + sports.torque);
		System.out.println();
		
		cruiser.startbike();
		cruiser.accelerate();
		cruiser.applybrakes();
		cruiser.stopbike();
	}

}
