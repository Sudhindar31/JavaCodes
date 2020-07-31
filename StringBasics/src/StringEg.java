
public class StringEg {

	public static void main(String[] args) {

		String name = "Sudhindar"; // String literals
		String message = new String("ssup fellas!"); // using new keyword

		System.out.println("The name is : " + name);
		System.out.println("The message is : " + message);

		int namelength = name.length();
		System.out.println("The length of the name is : " + namelength);

		String lowercasename = name.toLowerCase();
		System.out.println("The name in lowercase : " + lowercasename);

		String uppercasename = name.toUpperCase();
		System.out.println("The name in upppercase : " + uppercasename);
	}

}
