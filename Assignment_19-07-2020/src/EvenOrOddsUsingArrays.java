import java.util.Scanner;

public class EvenOrOddsUsingArrays {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number of indexes : ");
		int n = scan.nextInt();

		int[] myArray = new int[n];
		System.out.println("Enter all the numbers : ");
		for (int i = 0; i < n; i++) {
			myArray[i] = scan.nextInt();
		}
		System.out.println("The even numbers from the array are : ");
		for (int i = 0; i < n; i++) {
			if (myArray[i] % 2 == 0) {
				System.out.print(myArray[i] + "\t");
			}
		}
		System.out.println();
		System.out.println("The odd numbers from the array are : ");
		for (int i = 0; i < n; i++) {
			if (myArray[i] % 2 != 0) {
				System.out.print(myArray[i] + "\t");
			}
		}
		scan.close();
	}
}
