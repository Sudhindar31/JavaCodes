import java.util.Scanner;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		/*Scanner scan = new Scanner(System.in);
		System.out.println("Enter the numbers for the 2D Array");

		int[][] myArray = new int[2][2];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				myArray[i][j] = scan.nextInt();
				System.out.print("[" + i + "][" + j + "] : ");
				System.out.print(myArray[i][j] + "\t");
			}
			System.out.println();
		}
		scan.close();*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int r = scan.nextInt();
		System.out.println("Enter the number of columns");
		int c = scan.nextInt();

		int[][] myArray = new int[r][c];
		System.out.println("Enter the numbers for the array : ");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				myArray[i][j] = scan.nextInt();
			}
		}
		System.out.println("The array is :");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(myArray[i][j] + "\t");
			}
			System.out.println();
		}
		scan.close();
	}
}
