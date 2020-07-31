
public class ArrayEg {

	public static void main(String[] args) {
		int myArray[];
		myArray = new int[10]; // set size of the array

		myArray[0] = 4; // assigning the value to the array index
		myArray[1] = 8;
		myArray[4] = 34;
		myArray[6] = 567;
		myArray[9] = 8765;

		/*
		 * System.out.println(" The value of the index 1 is : " + myArray[1]);
		 * System.out.println(" The value of the index 6 is : " + myArray[6]);
		 * System.out.println(" The value of the index 9 is : " + myArray[9]);
		 */

		System.out.println("Displaying the content of the Array using loop : ");
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(" The values in the Array are : " + myArray[i]);
		}

		int mySecondaryArray[] = { 3, 4, 6, 8, 9, 78, 656, 65758 };

		for (int i = 0; i < mySecondaryArray.length; i++)

		{
			System.out.println(" The values in the mySecondaryArray are : " + mySecondaryArray[i]);

		}
	}
}