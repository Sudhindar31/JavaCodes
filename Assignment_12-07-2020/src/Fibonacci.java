import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println("Enter a number to display the Fibonacci upto that number");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		int i = 0, k = 1;

		while (i <= num) {
			System.out.println(i);
			int f = i + k;
			i = k;
			k = f;
		}
	}
}
