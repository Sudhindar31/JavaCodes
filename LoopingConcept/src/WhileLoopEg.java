import java.util.Scanner;

public class WhileLoopEg {

	public static void main(String[] args) {
		/*int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}*/
		System.out.println("Enter a number");
		Scanner scan = new Scanner (System.in);
		int num = scan.nextInt();
		scan.close();
		int i =1;
		
		System.out.println("The multiple of " + num);
		
		while(i<=10){
			int multi = i * num;
			System.out.println (num + " * " + i + " = " + multi);
			i++;
		}
	}

}
