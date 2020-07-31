
public class Baby {
	
	String name;
	String gender;
	int age;
	
	/*Baby(){
		System.out.println("Infant or Toddler");
	}*/
	void crawl(){
		System.out.println("Baby can crawl");
	}
	void cry(){
		System.out.println("Baby cries");
	}
	void play(){
		System.out.println("Baby plays");
	}
	public static void main(String[] args) {
		Baby infant = new Baby();
		infant.name = "Jack";
		infant.gender = "Boy";
		infant.age = 11;
		
		Baby toddler = new Baby();
		toddler.name = "Megan";
		toddler.gender = "Girl";
		toddler.age = 24;
		
		System.out.println("Name : " + infant.name);
		System.out.println("Gender : " + infant.gender);
		System.out.println("Age : " + infant.age + " Months");
		
		System.out.println("Name : " + toddler.name);
		System.out.println("Gender : " + toddler.gender);
		System.out.println("Age : " + toddler.age + " Months");
		
		infant.crawl();
		toddler.cry();
		infant.play();
	}

}
