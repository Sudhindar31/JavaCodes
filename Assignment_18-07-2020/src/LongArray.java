
public class LongArray {

	public static void main(String[] args) {
		/*
		 * Long[] LArray = new Long[5]; LArray[0] = 9868676687L; LArray[1] =
		 * 76575775L; LArray[2] = 42365237L; LArray[4] = 354126687L;
		 */

		Long values[] = { 765756L, 5435435L, 46464645L, 0L, 5767657565L };

		System.out.println("The list of numbers in the Array are : ");
		for (Long lng : values) {
			if (lng != 0) {
				System.out.println(lng);
			}
		}
	}

}
