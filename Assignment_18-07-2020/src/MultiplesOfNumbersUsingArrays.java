import java.util.Scanner;

public class MultiplesOfNumbersUsingArrays {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number of indexes : ");
		int num = scan.nextInt();
		System.out.println("Enter a number to be multiplied : ");
		int i = scan.nextInt();
		
		int[] myArray = new int[num];
		int multiply;
		System.out.println("Enter all the numbers : ");

		for (int j = 0; j < num; j++) {
			myArray[j] = scan.nextInt();
			multiply = myArray[j]*i;
			System.out.println("The number " + myArray[j] + "*" + i + " = " + multiply);
		}
		scan.close();
	}

}
