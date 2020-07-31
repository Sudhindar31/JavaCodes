import java.util.Scanner;

public class PrimeNumberorNot {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		scan.close();
		boolean result = false;
		// int i = 2;

		if (num == 0 || num == 1) {
			System.out.println("The given number :" + num + " is not a prime number");
		} else
			for (int i = 2; i <= num/2; i++) {
				result = (num % i != 0);
				if (!result) {
					System.out.println("The given number : " + num + " is not prime number ");
					break;
				}
			}
		if (result) {
			System.out.println("The given number : " + num + " is a prime number ");
		}

		/*
		 boolean flag = false; while(i <= num/2) { // condition for nonprime
		 number if(num % i == 0) { flag = true; break; }
		 
		 ++i; }
		  
		 if (!flag) System.out.println(num + " is a prime number."); else
		 System.out.println(num + " is not a prime number.");*/
		 
	}
}