
public class EvenNumbersForLoop {

	public static void main(String[] args) {
		System.out.print("The even number between 15 and 60 are : ");

		for (int i = 15; i <= 60; i++) {
			if (i % 2 == 0) {
				System.out.print("\n" + i); // "\t" --> tab, "\n" ---> new line
			}

		}

	}
}