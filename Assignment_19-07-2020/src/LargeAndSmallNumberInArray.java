public class LargeAndSmallNumberInArray {

	public static void main(String[] args) {
		
		System.out.println("ThreedimensionalArray");
		int [][] myArray = {{98,14,19}, {75,5,36}, {25,45,96}}; //threedimensional array
		int temp = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("[" + i + "][" + j + "] : ");
				System.out.print(myArray[i][j]+"\t");
				int k = myArray[i][0];
				if(k>myArray[i][j]){
					temp=k;
				}
			}
			System.out.println();
		}
		
	}

}
