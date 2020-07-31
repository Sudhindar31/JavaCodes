
public class MathOperation {

	public static void main(String[] args) {
		sumoftwo(10, 174);

		int i = 154, j = 132;
		sumoftwo(i, j);
		
		MathOperation sub = new MathOperation();
		sub.suboftwo(11, 7);
	}

	public static void sumoftwo(int i, int j) {
		int add = i + j;
		System.out.println("The sum of the 2 given numbers :" + i + " + " + j + " is :" + add);
	}
	void suboftwo(int i, int j){
		int minus = i - j;
		System.out.println("The difference of the 2 given numbers :" + i + " - " + j + " is :" + minus);
	}
	
}
