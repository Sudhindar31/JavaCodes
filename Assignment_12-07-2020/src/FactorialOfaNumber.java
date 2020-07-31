import java.util.Scanner;

public class FactorialOfaNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to find the factorial");
		int num = scan.nextInt();
		scan.close();
		int i = 1, factorial = 1;

		while (i <= num) {
			factorial *= i;
			i++;
		}
		System.out.println("Factorial of " + num + " is : " + factorial);
	}
}
