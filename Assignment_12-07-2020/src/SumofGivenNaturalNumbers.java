
public class SumofGivenNaturalNumbers {

	public static void main(String[] args) {
		int i = 1, j = 100, sum = 0;
		String s = "";
		do {
			sum += i;
			if (i == j) {
				s += i + "=";
			} else {
				s += i + "+";
			}
			i++;
		} while (i <= j);
		System.out.println(s);
		System.out.println("Sum of the natural numbers from 1 to 100 is :" + sum);
	}

}
