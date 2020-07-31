
public class CharacterArray {

	public static void main(String[] args) {
		char[] charArray = new char[6];

		charArray[0] = 'A';
		charArray[1] = 'E';
		charArray[2] = 'I';
		charArray[3] = 'O';
		charArray[4] = 'U';

		System.out.println("The values of the charArray : ");
		for (char c : charArray) {
			if(c != 0){
				System.out.println(c);
			}
			}
	}

}
