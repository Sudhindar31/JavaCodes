
public class SumOfNumbersInArray {

	public static void main(String[] args) {
		int numbers[] = {5,7,6,4,8,9,2,3};
		int sum = 0;
		
		for (int i : numbers){
			sum += i;
		}
		System.out.println("The sum of all the numbers in the array are : " + sum);
	}

}
