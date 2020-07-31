
public class ArmstrongNumber {

	void validArmstrong(int number) {

		int a = 0, b, c = 0;
		b = number;
		while (b > 0) {
			a = b % 10;
			b = b / 10;
			c = c + (a * a * a);
		}
		if (c == number) {
			System.out.println("Armstrong number");
		} else {
			System.out.println("not a Armstrong number");
		}
	}

	public static void main(String[] args) {
		ArmstrongNumber armstrongnumber = new ArmstrongNumber();
		armstrongnumber.validArmstrong(371);
	}
}
