
class bill {
	int custid;
	String name;
	int phoneno;
	double amount;

	public bill(String name) {
		this.name = name;
		System.out.println("Welcome to the Restaurant : " + name);
	}

	public bill(int custid, String name, int phoneno, double amount) {
		new bill(name);
		this.custid = custid;
		this.phoneno = phoneno;
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "bill [custid=" + custid + ", name=" + name + ", phoneno=" + phoneno + ", amount=" + amount + "]";
	}

}

public class Restaurant {

	public static void main(String[] args) {
		bill b = new bill(1, "Gopi", 23232398, 348.48);
		System.out.println(b.toString());
	}

}
