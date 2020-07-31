import java.util.Scanner;

public class SumofNaturalNumbers {

	public static void main(String[] args) {

		System.out.println("Listing the natural number between two numbers ");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int num1 = scan.nextInt();
		System.out.println("Enter the 2nd number");
		int num2 = scan.nextInt();
		scan.close();
		int sum = 0;

/*		for (int i = num1; i <= num2; i++) {
			sum += i;
		}
		System.out.println("The sum of the natural numbers between the two given numbers is : " + sum);*/
		int i = num1;
		
		while (i<=num2){
			sum += i;
			i++;
		}
		System.out.println("The sum of the natural numbers between the two given numbers is : " + sum);
	}

}
