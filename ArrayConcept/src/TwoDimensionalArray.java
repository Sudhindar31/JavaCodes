
public class TwoDimensionalArray {

	public static void main(String[] args) {
		System.out.println("Starting the program");

		/*int intArray[][] = new int[2][2];

		intArray[0][0] = 1;
		intArray[0][1] = 2;
		intArray[1][0] = 3;
		intArray[1][1] = 4;

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println("[" + i + "][" + j + "] : ");
				System.out.println(intArray[i][j]);
			}
		}*/
		int [][] literalIntArray = {{10,20}, {30,40}}; //literals
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print("[" + i + "][" + j + "] : ");
				System.out.print(literalIntArray[i][j]+ "\t");
			}
			System.out.println();
		}
		System.out.println("ThreedimensionalArray");
		int [][] threeArray = {{10,20,30}, {30,40,37}, {46,27,26}}; //threedimensional array
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("[" + i + "][" + j + "] : ");
				System.out.print(threeArray[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("Ending the program");
	}

}
