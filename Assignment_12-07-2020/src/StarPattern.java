import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number of rows to be displayed ");
		int rows = scan.nextInt();
		scan.close();
		int i = 1, j = 1;

		/*for (i = rows - 1; i >= 0; i--) {

			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}*/
		for (i = 0; i <= rows-1; i++) {

			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
