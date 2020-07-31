
public class Bag {

	String model;
	String type;
	int capacity;

	Bag() {
		System.out.println("No-Arg Constructor");
	}

	public Bag(String btype, int bcapacity) {
		type = btype;
		capacity = bcapacity;
	}

	public Bag(String bmodel, String btype, int bcapacity) {
		model = bmodel;
		type = btype;
		capacity = bcapacity;
	}

	void opencompartments() {
		System.out.println("Open the compartment");
	}

	void storethings() {
		System.out.println("Store things in the bag");
	}

	public static void main(String[] args) {
		Bag obj = new Bag();
		System.out.println("Model of the Bag : " + obj.model + " Type of the Bag : " + obj.type
				+ " Capacity of the bag : " + obj.capacity);
		obj.model = "Backpack";
		obj.type = "Office Bag";
		obj.capacity = 21;
		System.out.println("Model of the Bag : " + obj.model + " Type of the Bag : " + obj.type
				+ " Capacity of the bag : " + obj.capacity);
		Bag obj1 = new Bag("Travel Bag", 40);
		System.out.println("Type of the Bag : " + obj1.type + " Capacity of the bag : " + obj1.capacity);

		Bag obj2 = new Bag("Sling", "College Bag", 20);
		System.out.println("Model of the Bag : " + obj2.model + " Type of the Bag : " + obj2.type
				+ " Capacity of the bag : " + obj2.capacity);
	}

}
