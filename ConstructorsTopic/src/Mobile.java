
public class Mobile {

	String brand;
	Boolean isSmartPhone;
	double price;
	int ram;

	Mobile() {
		brand = "Samsung";
		isSmartPhone = true;
		price = 58000.00;
		ram = 8;
	}

	void makecall(long phonenumber) {
		System.out.println("making call to :" + phonenumber);
	}

	void charging(boolean isCharging) {
		System.out.println("Is the phone charging :" + isCharging);
	}

	void locked(long isLocked) {
		System.out.println("making call to :" + isLocked);
	}

	public static void main(String[] args) {
		Mobile mob = new Mobile();
		System.out.println("Brand :" + mob.brand + " Is it a smartphone :" + mob.isSmartPhone + " Price :" + mob.price
				+ " RAM :" + mob.ram);

		mob.brand = "Nokia";
		mob.isSmartPhone = true;
		mob.price = 32000.00;
		mob.ram = 4;

		System.out.println("Brand :" + mob.brand + " Is it a smartphone :" + mob.isSmartPhone + " Price :" + mob.price
				+ " RAM :" + mob.ram);
	}

}
