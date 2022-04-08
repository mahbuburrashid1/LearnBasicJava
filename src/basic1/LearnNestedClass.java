package basic1;

public class LearnNestedClass {
	
	
	int age = 44;
	static String firstName = "Rashid";
	
	
	
	public static class computer{
	
	String computerName = "Mac";
	static int ram= 16;
	
	public static void main(String[]args) {
	
	System.out.println("child class");
	
	computer mycomputer = new computer();
	
	System.out.println(mycomputer.computerName           );
	
	System.out.println(computer.ram);
	
	
	mycomputer.computerdisplay();
	LearnNestedClass learn=new LearnNestedClass();
	System.out.println(learn.age);
	
	}	
	
	public void computerdisplay() {
		
		System.out.println("this is computer display");
	}
	
	
	}	
	
public static void main(String[]args) {	
	
System.out.println("Parent class");	
	computer mycom = new computer();
	System.out.println(mycom.computerName);
	
	System.out.println(computer.ram);
}	
	
	
	
	
	
	

	
	
	
	
	
	
	
	

}
