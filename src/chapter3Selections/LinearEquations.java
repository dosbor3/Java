/* 04/2/2021
 * This program provides a solution for a linear equation using Cramer's rule
 * This program prompts the user to enter a, b, c, d, e, and f and displays the result.  If
 * ad - bc = 0, report that "The equation has no solution"
 * 
 */
package chapter3Selections;

import java.util.Scanner;
public class LinearEquations {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter values for a - f
		System.out.print("Enter a, b, c, d, e, and f:\t");
		double a = input.nextDouble(), b = input.nextDouble(), c = input.nextDouble();
		double d = input.nextDouble(), e = input.nextDouble(), f = input.nextDouble();
	
		if ((a * d) - (b * c) == 0) {
			System.out.println("The equation has NO solution...");
			
		}
		else {
			double x = (e * d - b * f) / (a * d - b * c);
			double y = (a * f - e * c) / (a * d - b * c);
			System.out.println("x is " + x + " and y is " + y);
		}
		

	}

}
