import java.util.Scanner;

public class SwitchCaseEg {

	public static void main(String[] args) {
		System.out.println("Enter a alphabet to find out if it is a vowel or not");
		Scanner scan = new Scanner(System.in);
		String alphabet = scan.next();
		scan.close();

		switch (alphabet) {

		case "A":
			System.out.println("The given alphabet " + alphabet + " is a vowel");
			break;
		case "E":
			System.out.println("The given alphabet " + alphabet + " is a vowel");
			break;
		case "I":
			System.out.println("The given alphabet " + alphabet + " is a vowel");
			break;
		case "O":
			System.out.println("The given alphabet " + alphabet + " is a vowel");
			break;
		case "U":
			System.out.println("The given alphabet " + alphabet + " is a vowel");
			break;
		default:
			System.out.println("The given alphabet " + alphabet + " is not a vowel");
			break;
		}
	}
}
