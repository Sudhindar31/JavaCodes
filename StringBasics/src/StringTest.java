
public class StringTest {

	String s1 = "World";
	String s2 = "Peace/beginning";
	String s3 = "WORLD/ ";
	
	void compare(){
		//System.out.println(s1==s3);
		System.out.println(s1.indexOf('l'));
	}
	
	public static void main(String[] args) {
		
		StringTest s = new StringTest();
		/*System.out.println(s.s1.compareTo(s.s2));
		
		System.out.println(s.s3.compareToIgnoreCase(s.s1));
		
		System.out.println(s.s1.concat(s.s2));
		
		System.out.println(s.s2.contains("e b"));
		
		System.out.println(s.s3.equalsIgnoreCase(s.s1));*/
		
		//System.out.println(s.s3.indexOf('L'));
		
		/*char[] testarray = s.s1.toCharArray();//s.s2.split("/");
		
		for (int i=0; i<testarray.length; i++){
			System.out.println(testarray[i]);
		}*/
		
		//System.out.println(s.s2.substring(0, 5));
		
		//System.out.println(s.s1.toCharArray());
		
		//System.out.println(s.s3.toLowerCase());
		
		System.out.println(s.s1.toUpperCase());
		
		//s.compare();
	}
}

/*public class Operation{
	
	int data=50;  
	  
	 void change(int data){  
	 data=data+100;//changes will be in the local variable only  
	 }  
	     
	 public static void main(String args[]){  
	   Operation op=new Operation();  
	  
	   System.out.println("before change "+op.data);  
	   op.change(500);  
	   System.out.println("after change "+op.data);  
	  
	 }  
}
*/