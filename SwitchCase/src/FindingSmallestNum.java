import java.util.Scanner;

public class FindingSmallestNum {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1 = scan.nextInt();
		System.out.println("Enter the second number");
		int num2 = scan.nextInt();
		System.out.println("Enter the third number");
		int num3 = scan.nextInt();
		String result;
		scan.close();

		
		 result = ((num1 < num2) && (num1 < num3)) ?
		 "num1 is smaller than num2 and num3" : 
		((num2 < num3) && (num2 < num1)) ? 
		"num2 is smaller than num3 and num1" :
		 "num3 is smaller than num1 and num2";
		
		 System.out.println(result);
	}

}
