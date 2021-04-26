package demo;
/*
 *  Mrs. James ~ Feb 9, 21 ~ Period 6 
 */
import java.util.Scanner;

//class declaration
public class FeetToMeters {
	
	//main method definition
	public static void main(String[] args) {
		
		//Create Scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompt the user
		System.out.print("Enter a value for feet: ");
		double feet = input.nextDouble();
		
		//convert from feet to meters
		double meter = feet * 0.305;
		
		//Display the results to user
		System.out.println(feet + " feet is " + meter +  " meters");
		
		
	}

}
