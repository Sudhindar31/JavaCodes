
public class TriangularMatrixFromArray {

	public static void main(String[] args) {
		System.out.println("Upper Triangular Matrix from the Array");
		int [][] fourArray = {{10,20,30,34}, {30,40,37,56}, {46,27,26,75}, {57,47,35,38}}; //threedimensional array
		for (int i = 0; i < fourArray.length; i++) {
			for (int j = 0; j < fourArray.length-i; j++) {
				//System.out.print("[" + i + "][" + j + "] : ");
				System.out.print(fourArray[i][j]+"\t");
			}
			System.out.println();			
		}
	}

}
