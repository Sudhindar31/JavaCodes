
public class DisplayValues {
	
	DisplayValues(){
		
	}
	void display(String strvalue){
		System.out.println("The String value is :" + strvalue);
	}
	void display(String strvalue, char charvalue){
		System.out.println("The String value is :" + strvalue);
		System.out.println("The String value is :" + charvalue);
	}
	void display(char charvalue, int intvalue){
		System.out.println("The String value is :" + charvalue);
		System.out.println("The String value is :" + intvalue);
	}
	public static void main(String[] args) {
		DisplayValues disp = new DisplayValues();
		
		disp.display("Hello");
		System.out.println("===========");
		disp.display("Wassup", 'A');
		System.out.println("===========");
		disp.display('B', 8);
	}

}
