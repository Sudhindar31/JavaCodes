import java.util.Scanner;

public class NonRepeatedElements {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number of indexes : ");
		int n = scan.nextInt();
		int[] myArray = new int[n];
		System.out.println("Enter all the numbers : ");
		for (int i = 0; i < n; i++) {
			myArray[i] = scan.nextInt();
		}

		System.out.println("The numbers not repeated in the array are : ");
		for (int i = 0; i < n; i++) {
			int count = 0;

			for (int j = 0; j < n; j++) {
				if (myArray[i] == myArray[j] && i != j) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println(myArray[i] + " ");
			}
		}
		scan.close();
	}

}
