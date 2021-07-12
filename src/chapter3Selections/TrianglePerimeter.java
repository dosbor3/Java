/* 5/3/21
 * This program reads in edges for a triangle and computes the perimeter if the input is valid
 * The input is valid if the sum of every pair of two edges is greater than the remaining edge
 */
package chapter3Selections;

import java.util.Scanner;

public class TrianglePerimeter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the three edges for a triangle: ");
		double edge1 = input.nextDouble(), edge2 = input.nextDouble(), edge3 = input.nextDouble();
		
		if (edge1 + edge2 > edge3 && edge1 + edge3 > edge2 && edge2 + edge3 > edge1) {
			double perimeter = edge1 + edge2 + edge3;
			System.out.println("The triangle with edges " + edge1 + "," + edge2 + ", and "+ edge3 +" has a perimeter of " + perimeter);
			
			
		}
		else {
			System.out.println("Invalid Input...");
		}
		
		

	}

}
