
public class ArithmeticOperations {

	void sum (int a, int b){
		int sum = a + b;
		System.out.println("The sum of 2 given numbers is : " + sum);
	}
	void multiply (int a, int b){
		int multiply = a * b;
		System.out.println(a + " multiplied by " + b + " is : " + multiply);
	}
	void minus (int a, int b){
		int minus = a - b;
		System.out.println(a + " minus " + b + " is : " + minus);
	}
	void divide (int a, int b){
		int divide = a / b;
		System.out.println(a + " divided by " + b + " is : " + divide);
	}
	void modulus (int a, int b){
		int modulus = a % b;
		System.out.println(a + " mod of " + b + " is : " + modulus);
	}
	public static void main(String[] args) {
		ArithmeticOperations calc = new ArithmeticOperations();
		calc.sum(20, 62);
		calc.multiply(34, 45);
		calc.minus(43, 36);
		calc.divide(34, 5);
		calc.modulus(45, 7);
	}

}
