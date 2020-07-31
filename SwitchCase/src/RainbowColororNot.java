import java.util.Scanner;

public class RainbowColororNot {

	public static void main(String[] args) {

		System.out.println("Enter a colour");
		Scanner scan = new Scanner(System.in);
		String colour = scan.next().toLowerCase();
		scan.close();

		switch (colour) {

		/*case "red":
			System.out.println("This is a Rainbow colour");
			break;
		case "orange":
			System.out.println("This is a Rainbow colour");
			break;
		case "yellow":
			System.out.println("This is a Rainbow colour");
			break;
		case "green":
			System.out.println("This is a Rainbow colour");
			break;
		case "blue":
			System.out.println("This is a Rainbow colour");
			break;
		case "indigo":
			System.out.println("This is a Rainbow colour");
			break;
		case "violet":
			System.out.println("This is a Rainbow colour");
			break;
		default:
			System.out.println("This is not a Rainbow colour");*/
		
		case "red":
		case "orange":
		case "yellow":
		case "green":
		case "blue":
		case "indigo":
		case "violet":
			System.out.println("This is a Rainbow colour");
			break;
		default:
			System.out.println("This is not a Rainbow colour");
		}
	}
}
