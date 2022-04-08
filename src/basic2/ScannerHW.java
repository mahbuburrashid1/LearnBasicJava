package basic2;

import java.util.Scanner;

public class ScannerHW {
	
	

		
		
		public static void main(String []args) {
			Scanner input= new Scanner(System.in);
			
			
			System.out.println("                     COSTCO      ");
			System.out.println("");
			System.out.println("");
			System.out.println("                 Commack : 240    ");
			
			System.out.println("                 Commack, NY 11725");
			
			
			
			System.out.println("===================================");
			System.out.println("");
			
			System.out.println("enter avocado's price");
			Double qntAvocado= input.nextDouble();
			
			System.out.println("enter brussel's price");
			Double qntBrussel= input.nextDouble();
			
			System.out.println("enter broccoli's price");
			Double qntBroccoli= input.nextDouble();
			
			
			
			System.out.println("Total Number of Items Sold=" +"\t"   +"3");
			Double subTotal= qntAvocado+qntBrussel+qntBroccoli;
			System.out.println("Subtotal before tax=" +"\t"  +"\t" +"$"+subTotal);
			
			double taxAddition=subTotal*.08;
			//System.out.println("Tax paid for this purchase " +"\t"                    +"$" +taxAddition);
			System.out.printf("Tax paid for this purchase= $%.2f  ",+taxAddition);
			System.out.println("");
			
			double totalAfterAddingTax=subTotal+taxAddition;
			System.out.printf("Total cost of this purchse = $%.3f",      +totalAfterAddingTax);
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("\t"+ "\t"+ "   THANK YOU" +"\n" + "\t"+ "\t"+ "Please Come Again");
			
			
			
			
		}}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


