/*
 * Mrs. James ~ 03/09/2021 ~ Period 6
 * 
 * 1. Setup the program to retrieve user input
 * 2. Prompt the user to enter radius 
 * 3. Store the user's input for radius
 * 4. Determine if radius <= 0, if so, Display an error message, +
 * 5. Determine if radius > 0, if so, calculate the area and display the results to the user 
 */
package chapter4SelectionStatements;

import java.util.Scanner;  // step 1.
public class IfRadius {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);	//step 1.
		
		System.out.print("Enter radius value: ");  //step 2. 
		
		double radius = input.nextDouble();  //step 3. 
		
		/* Syntax for an if statement
		 * if (boolean-expression) {
		 * 		statement(s);
		 * }
		 */
		if (radius <= 0) {
			System.out.println("*** INVALID INPUT ***");
			
		}
		
		if (radius > 0) {
			double area = radius * radius * 3.14159;
			System.out.println("The area of a circle with radius "+ radius + " is " + area);
		}
		
		
		
	}

}
