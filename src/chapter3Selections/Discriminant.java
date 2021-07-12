/* 4/27/2021
 * This program prompts the user to enter the values for a, b, and c of a quadratic equation
 * using the discriminant of the quadratic equation b^2 - 4ac, to determine the roots (if any) of the quadratic
 * and display them to the user
 * If the discriminant is positive display two roots.  If the discriminant is 0, display one root.  
 * Otherwise display "The equation has no real roots"
 * //double root1 = (-(b) + (Math.sqrt(discriminant)) / 2 * a);
 */
package chapter3Selections;

import java.util.Scanner;

public class Discriminant {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a, b, c:\t");
		double a = input.nextDouble(), b = input.nextDouble(), c = input.nextDouble();
		
		double discriminant = (Math.pow(b,2) - (4 * a * c));		
				
		if (discriminant >= 1) {
			double root1 = (-b +(Math.pow(discriminant, 0.5))) / (2 * a);
			double root2 = (-b -(Math.pow(discriminant, 0.5))) / (2 * a);
			System.out.println("The equation has two roots " + root1 + " and " + root2);
		}
		else if (discriminant == 0) {
			double root1 = (-b + Math.sqrt(discriminant) / (2 * a));
			System.out.println("The equation has one root " + root1 );
			
		}
		else {
			System.out.println("The equaton has NO real roots.");
		}
		
	
		
	}

}
