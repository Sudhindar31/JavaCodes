
public class StringArray {

	public static void main(String[] args) {
		String[] strArray = new String[5];

		strArray[1] = "Lamborgini";
		strArray[4] = "Porsche";
		strArray[3] = "Ferrari";

		System.out.println("The values of the strArray : ");

		/*
		 * for (int i=0; i<strArray.length; i++){ if(strArray[i]!=null){
		 * System.out.println(strArray[i]); } }
		 */
		for (String s : strArray) {
			if(s != null){
				System.out.println("==="+ s + "***");
			}
			}
	}
}
