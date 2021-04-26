/*
 * Mrs. James ~ 04/22/21 ~ Period 6
 * ALGORITHM
 * 1.  Setup program to retrieve user input
 * 2.  Prompt the user to enter score and pay
 * 3.  Store user's input for score and pay (creating variables)
 * 4.  Determine pay increase based on score
 * 5.  Display results to user
 */
package chapter4SelectionStatements;

import java.util.Scanner;   

public class Four_Four {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Score:\t");
		double score = input.nextDouble();
		
		System.out.print("Enter Pay:\t");
		double pay = input.nextDouble();
		
		if (score > 90) {
			pay *= .03;		 
			System.out.println("Based on your score of " + score + ", you have earned a pay increase of 3% ");
		}
		else {
			pay *= .01;
			System.out.println("Based on your score of " + score + ", you have earned a pay increase of 1% ");
		}
		
		//Display the results
		System.out.println("Your pay increase is " + pay);
		
		
		
	}

}
