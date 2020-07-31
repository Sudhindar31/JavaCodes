import java.util.Scanner;

public class OddNumbersAndTheirSum {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number upto which the odd numbers to be displayed ");
		int num = scan.nextInt();
		scan.close();
		int i = 1;
		String nums = "";
		int sum = 0;
		do {
			if (i % 2 != 0) {
			nums += i + " ";
				sum += i;
			}
			i++;
		} while (i <= num);

		System.out.print("The odd numbers upto the given number are " + nums + " and the sum of these numbers are " + sum);
	}
}
