import java.util.Scanner;

public class NumberofDigits {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		int count = 0;
		
		while(num!=0){
			num/=10;
			++count;
		}
		System.out.println("The number of digits : " + count);
	}

}
