
public class Wallet {

	String color;
	String material;
	String brand;
	int noofcompartments;

	Wallet(){
		System.out.println("Pocket sized Wallet");
	}
	void cashcompartment() {
		System.out.println("It holds all my cash ");
	}
	void coinspouch() {
		System.out.println("It holds all the coins ");
	}

	public static void main(String[] args) {
		Wallet w = new Wallet(); //instance /object
		w.color = "Brown";
		w.material = "Leather";
		w.brand = "Hi Design";
		w.noofcompartments = 3;

		System.out.println("Color : " + w.color);
		System.out.println("Material : " + w.material);
		System.out.println("Brand : " + w.brand);
		System.out.println("No of Comparments : " + w.noofcompartments);

		w.cashcompartment();
		w.coinspouch();
	}
}
