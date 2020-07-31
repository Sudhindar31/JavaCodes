import java.util.Scanner;

public class DoWhileLoopEg {

	public static void main(String[] args) {
		/*System.out.println("Print the numbers in reverse");
		
		int num = 10;
		do{
			System.out.println(num);
			num--;
		}while (num>=1);*/
		
		System.out.println("Enter a number");
		Scanner scan = new Scanner (System.in);
		int num = scan.nextInt();
		scan.close();
		int i =1;
		
		System.out.println("The multiple of " + num);
		
		do{
			int multi = i * num;
			System.out.println (num + " * " + i + " = " + multi);
			i++;
		}while(i<=10);
			
		}
	}
