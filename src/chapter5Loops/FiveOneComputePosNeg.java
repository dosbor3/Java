/* 7/8/2021
 * This program reads an unspecified number of integers, determines how many 
 * positive and negative values have been read, and computes the total and 
 * average of the input values (not counting zeros).  Program ends with the 
 * input 0.  The average is displayed as a floating-point number.
 * 
 * ALGORTIHM:
 * 1.  Setup program to retrieve user input
 * 2.  Read in the values
 * 3.  Determine how many positive and negative values have been read
 * 4.  Compute the total and average of the input values not counting zeros
 * 5.  Display the average as a floating-point number
 */
package chapter5Loops;

import java.util.Scanner;

public class FiveOneComputePosNeg {

	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		int pos_count = 0;
		int neg_count = 0;
		double total = 0;
		
		System.out.print("Enter an integer, the input ends if it is 0:  ");
		int number = input.nextInt();
				
		while (number != 0) {
			
			if (number < 0) {
				neg_count ++;
				total += number;
			}
			else if (number > 0){
				pos_count ++;
				total += number;
				
			}
			number = input.nextInt();
		}
		double average = total / (pos_count + neg_count);
		
		if (number == 0 && total == 0) {
			System.out.println("No numbers entered except 0...");
		}
		else {
			//Display results
			System.out.println("The number of positives is " + pos_count);
			System.out.println("The number of negatives is " + neg_count);
			System.out.println("The total is " + total);
			System.out.printf("The average is %4.2f" , average);
		}

	}

}
