package basic1;

public class LearnStatic {
	
	
static String name ="Rashid";	
	int salary =500;
	
public static void main (String[]args) {
	
	
	
	System.out.println("student name is     "  +   LearnStatic.name);

	LearnStatic learn=new LearnStatic();
	
System.out.println("student salary is  "  +learn.salary);

learn.display();


}
	
	
	
	
	void display() {
		
		System.out.println( "Display ");	
		
		
	}
	
	
//	System.out.println( "Display ");
	

}
