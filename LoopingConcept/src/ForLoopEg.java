import java.util.Scanner;

public class ForLoopEg {

	public static void main(String[] args) {
		/*int i;
		for (i = 1; i <= 10; i++) {
			System.out.println("The output is :" + i);
		}
		for (i = 10; i > 0; i--) {
			System.out.println("The output when reversed :" + i);
		}*/
		System.out.println("Enter a number");
		Scanner scan = new Scanner (System.in);
		int num = scan.nextInt();
		scan.close();
		
		System.out.println("The multiple of " + num);
		
		for (int i=1; i<=10; i++){
			int multi = i * num;
			System.out.println (num + " * " + i + " = " + multi);
		}
	}

}
