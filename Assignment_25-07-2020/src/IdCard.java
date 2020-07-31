
public class IdCard {

	String companyname;
	int empno;
	String empname;
	boolean isphotodisp;

	IdCard() {
		System.out.println("No Args Constructor");
	}

	public IdCard(String acompanyname, int aempno, String aempname) {
		companyname = acompanyname;
		empno = aempno;
		empname = aempname;
	}

	public IdCard(String acompanyname, int aempno, String aempname, boolean aisphotodisp) {
		companyname = acompanyname;
		empno = aempno;
		empname = aempname;
		isphotodisp = aisphotodisp;
	}

	void provideaccess() {
		System.out.println("provides access to the ODC");
	}

	public static void main(String[] args) {
		IdCard obj = new IdCard();
		System.out.println("Name of the company : " + obj.companyname + "The employee number is : " + obj.empno
				+ "The name of the employee : " + obj.empname + " Does the id card display the photo : "
				+ obj.isphotodisp);

		obj.companyname = "Google";
		obj.empname = "Erik";
		obj.empno = 105804;
		obj.isphotodisp = true;

		System.out.println("Name of the company : " + obj.companyname + "The employee number is : " + obj.empno
				+ "The name of the employee : " + obj.empname + " Does the id card display the photo : "
				+ obj.isphotodisp);

		IdCard obj1 = new IdCard("Blizzard", 14947, "David");
		System.out.println("Name of the company : " + obj1.companyname + "The employee number is : " + obj1.empno
				+ "The name of the employee : " + obj.empname);

		IdCard obj2 = new IdCard("Aidos Interactive", 13847, "Jack", true);
		System.out.println("Name of the company : " + obj2.companyname + "The employee number is : " + obj2.empno
				+ "The name of the employee : " + obj2.empname + " Does the id card display the photo : "
				+ obj2.isphotodisp);
		
		obj2.provideaccess();
	}

}
