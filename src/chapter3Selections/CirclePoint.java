/* 5/10/21
 * This program prompts the user to enter a point (x,y) and checks whether the point is within 
 * the circle centered at (0,0) with radius 10. Using the distance formula 
 * sqrt of (x2 - x1) squared + (y2 - y1) squared
 * if the result is less than or equal to 
 * 10, the point lies within the circle * 
 */

package chapter3Selections;

import java.util.Scanner;

public class CirclePoint {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter a point with two coordinates: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x1 = 0, y1 = 0;
		
		boolean point = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), .5) < 10;
		
		if (point) {
			System.out.println("Point (" + x2 + ", " + y2 + ") is in the circle");
		}
		else {
			System.out.println("Point (" + x2 + ", " + y2 + ") is NOT in the circle");
		}

	}

}
