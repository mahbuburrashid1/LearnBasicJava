package basic1;

public class LearnCasting {
	
	float rent=2500.500f;
	double AprilRent=(double)rent;
	float mayRent = (float)AprilRent;
			
			
			
	static int number = 34;
	static double salary = 345.68;
			
	
	
	public static void main(String[]args) {
		
		
	double num = LearnCasting.number;
	int newsalary = (int) LearnCasting.salary;
	
	LearnCasting lc = new LearnCasting();
	
System.out.println (lc.mayRent);
	
		
System.out.println(newsalary);		
		
	
	
	
	
	
System.out.println(num);		

	
	
	
	
	}	

}
