
public class SwapTwoNumbers {

	int a, b;

	void swap(int inputa, int inputb) {
		a = inputb;
		b = inputa;
		System.out.println("The value of a is : " + a);
		System.out.println("The value of b is : " + b);
	}

	public static void main(String[] args) {
		SwapTwoNumbers s = new SwapTwoNumbers();
		s.swap(20, 30);
	}

}
