package chapter4SelectionStatements;
//Mrs. James ~ 04/06/2021 ~ Period 6
/*ALGORITHM
 * 1. Setup program to retrieve user input
 * 2. Prompt the user to enter amount
 * 3. Store user's input for amount
 * 4. Create a variable to hold the remaining amounts after each breakdown
 * 5. Determine the breakdown for dollars, quarters, dimes, nickels, and pennies
 * 6. Display output to user
 * 
 */

import java.util.Scanner;
public class ComputeChange {	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an amount, for example, 11.58 	");
		double amount = input.nextDouble();
		
		int remainingAmount = (int)(amount * 100);
		System.out.println(remainingAmount);
		
		int dollars = remainingAmount / 100;
		System.out.println(dollars);
		
		
	}

}
