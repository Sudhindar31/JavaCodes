
public class Bottle {
	
	String color;
	String material;
	int capacity;
	
	void storingwater(){
		System.out.println("Storing water");
	}
	void openthebottlelid(){
		System.out.println("Open the bottle lid to fill water");
	}
	void closethebottlelid(){
		System.out.println("Close the bottle lid to avoid spilling water");
	}
	public static void main(String[] args) {
		Bottle tupperware = new Bottle (); //instance /object
		tupperware.color = "Yellow";
		tupperware.material = "plastic";
		tupperware.capacity = 1;
		
		System.out.println("Color : " + tupperware.color);
		System.out.println("Material : " + tupperware.material);
		System.out.println("Capacity : " + tupperware.capacity + " litre");
		
		tupperware.storingwater();
		tupperware.openthebottlelid();
		tupperware.closethebottlelid();
	}

}
