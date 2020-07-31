
public class DoubleArray {

	public static void main(String[] args) {
		double[] dArray = new double[6];
		dArray[0] = 20.56;
		dArray[1] = 30.44;
		dArray[2] = 40.434;
		dArray[3] = 50.512;
		dArray[4] = 60.425;

		System.out.println("The list of values in the array are : ");
		/*for (int i = 0; i < dArray.length; i++) {
			if (dArray[i] != 0.0) {
				System.out.println(dArray[i]);
			}
		}*/
		for (double d : dArray){
			System.out.println(d);
		}
	}

}
