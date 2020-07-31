
public class EvenOrOdd {
	int a;

	void evenodd(int inputa) {
		a = inputa;
		if(inputa%2 == 0){
			System.out.println("The given number is an even number");	
		}
		else{
			System.out.println("The given given is a odd number ");
		}
	}
	public static void main(String[] args) {
		EvenOrOdd k = new EvenOrOdd();
		k.evenodd(30);
		k.evenodd(25);
	}

}
