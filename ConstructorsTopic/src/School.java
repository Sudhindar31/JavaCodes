
public class School {
	String name;
	String principalname;
	String area;
	int noofStudents;

	School() {
		System.out.println("No Arg Constructor");
	}

	public School(String sname) {
		name = sname;
	}

	public School(String sname, String sprincipalname) {
		name = sname;
		principalname = sprincipalname;
	}

	public School(String sname, String sprincipalname, String sarea, int snoofStudents) {
		name = sname;
		principalname = sprincipalname;
		area = sarea;
		noofStudents = snoofStudents;
	}

	void hasHoliday() {
		System.out.println("It is a holiday, and the school is closed");
	}

	void isopen() {
		System.out.println("The school is open");
	}

	public static void main(String[] args) {
		School sch1 = new School();
		System.out.println("School Name : " + sch1.name + " Name of the Principal : " + sch1.principalname + " Area : "
				+ sch1.area + " Total Students in the school : " + sch1.noofStudents);

		sch1.name = "Little flower Eng Med";
		sch1.principalname = "John";
		sch1.area = "Tirupathi";
		sch1.noofStudents = 800;
		System.out.println("School Name : " + sch1.name + " Name of the Principal : " + sch1.principalname + " Area : "
				+ sch1.area + " Total Students in the school : " + sch1.noofStudents);

		School sch2 = new School("Saraswati Vidya mandir", "Ram Kumar", "Vijayawada", 1200);
		System.out.println("School Name : " + sch2.name + " Name of the Principal : " + sch2.principalname + " Area : "
				+ sch2.area + " Total Students in the school : " + sch2.noofStudents);
		
		School sch3 = new School("Good stone", "Vignesh");
		System.out.println("School Name : " + sch3.name + " Name of the Principal : " + sch3.principalname);
		
	}

}
