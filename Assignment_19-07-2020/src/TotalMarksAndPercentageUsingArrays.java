import java.util.Scanner;

public class TotalMarksAndPercentageUsingArrays {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number of indexes : ");
		int n = scan.nextInt();

		int[] mymarks = new int[n];
		System.out.println("Enter all the marks : ");
		for (int i = 0; i < n; i++) {
			mymarks[i] = scan.nextInt();
		}
		int total = 0;
		for (int i = 0; i < n; i++) {
			total += mymarks[i];
		}
		double percentage = (total / n);
		System.out.println("The total marks is : " + total );
		System.out.println("The percentage is : " + percentage + "%");
		scan.close();
	}
}