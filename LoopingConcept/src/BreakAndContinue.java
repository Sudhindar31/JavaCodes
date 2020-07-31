
public class BreakAndContinue {

	public static void main(String[] args) {
		System.out.println(" Print the numbers from 1 to 10, except 5 and 8 :");
		for (int i= 1; i<=10; i++){
			if (i == 5 || i == 8)
				continue;
			System.out.println(i);
		}
		System.out.println(" Print the numbers from 1 to 5, and not the last number");
		for (int i= 1; i<=10; i++){
			if (i == 5)
				break;
			System.out.println(i);
	}

	}
}