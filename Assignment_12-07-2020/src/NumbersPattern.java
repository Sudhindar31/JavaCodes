import java.util.Scanner;

public class NumbersPattern {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number of rows to be displayed ");
		int rows = scan.nextInt();
		scan.close();
		int i = 1, j = 1;

		for (i = 1; i <= rows; i++) {

			for (j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

}
