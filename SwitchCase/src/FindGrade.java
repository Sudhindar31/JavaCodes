public class FindGrade {

	public static void main(String[] args) {
		char grade = 'C';
		String result;

		System.out.println("The grade is : " + grade);

		switch (grade) {

		case 'A':
			result = "your marks should be between 85 to 100";
			break;
		case 'B':
			result = "your marks should be between 60 to 84";
			break;
		case 'C':
			result = "your marks should be between 35 to 59";
			break;
		default:
			result = "your have not passed";
			break;
		}
		System.out.println(result);
	}
}
