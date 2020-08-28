
public class NoOfCharsInaString {

	String s = " pneumono ultra microscopic silico volcano coniosis ";
	
	public static void main(String[] args) {
		
		NoOfCharsInaString s1 = new NoOfCharsInaString();
		
		//char[] chararray = s1.s.toCharArray();
		
		
		//convert String into char array
		
		/*for (int i=0; i<chararray.length; i++){
			System.out.println(chararray[i]);
		}*/
		
		//find the no. of characters in string
		//System.out.println(chararray.length);
		
		//reverse the string
		/*StringBuilder revstr = new StringBuilder(s1.s);	
		System.out.println(revstr.reverse());*/
		
		//count no of words in String
		String str = s1.s.trim();
		String[] str1 = str.split(" ");
		System.out.println(str1.length);
	}
	
}
