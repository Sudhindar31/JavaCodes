import java.util.Scanner;

public class MonthForNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter a number equal to or between 1 and 12");
		Scanner scan = new Scanner (System.in);
		int num = scan.nextInt();
		scan.close();
		
		switch (num) {

		case 1:
			System.out.println("The 1st month of a year is January");
			break;
		case 2:
			System.out.println("The 2nd month of a year is February");
			break;
		case 3:
			System.out.println("The 3rd month of a year is March ");
			break;
		case 4:
			System.out.println("The 4th month of a year is April ");
			break;
		case 5:
			System.out.println("The 5th month of a year is May ");
			break;
		case 6:
			System.out.println("The 6th month of a year is June ");
			break;
		case 7:
			System.out.println("The 7th month of a year is July ");
			break;
		case 8:
			System.out.println("The 8th month of a year is August ");
			break;
		case 9:
			System.out.println("The 9th month of a year is September ");
			break;
		case 10:
			System.out.println("The 10th month of a year is October ");
			break;
		case 11:
			System.out.println("The 11th month of a year is November ");
			break;
		case 12:
			System.out.println("The 12th month of a year is December ");
			break;
		default:
			System.out.println("The number should only between 1 and 12");
			break;
	}

}
}