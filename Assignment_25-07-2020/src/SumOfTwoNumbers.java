
public class SumOfTwoNumbers {

	void add(int a, double b) {
		double add = a + b;
		System.out.println("Sum of the 2 given numbers : " + add);
	}

	void add(long a, float b) {
		float add = a + b;
		System.out.println("Sum of the 2 given numbers : " + add);
	}

	void add(double a, int b) {
		double add = a + b;
		System.out.println("Sum of the 2 given numbers : " + add);
	}

	public static void main(String[] args) {
		SumOfTwoNumbers sum = new SumOfTwoNumbers();
		sum.add(157, 463.09);
		sum.add(343476348, 346.474);
		sum.add(45.67, 33);
	}
}
