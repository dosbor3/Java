/*7-8-2021
 * This program generates is a modification to listing 5.4.  This program will 
 * generate ten random addition questions for two integers between 1 and 15. 
 * This program will display the correct count and test time
 * 
 * ALGORITHM:
 * 1.  Setup program to retrieve user input
 * 2.  Create constant for number of generated questions
 * 3.  Setup loop to generate 10 random addition questions for two integers 
 *     between 1 and 15( a + Math.random() * b) RETURNS an integer between 
 *     a and a + b, excluding a + b ****
 * 4.  Start the clock
 * 5.  Track the correct responses
 * 6.  Stop clock after all 10 responses have been submitted
 * 7.  Display results to user
 * 
 */
package chapter5Loops;

import java.util.Scanner;

public class FiveTwoRepeatAdditions {

	public static void main(String[] args) {
		final int NO_OF_QUESTIONS = 10;
		Scanner input = new Scanner(System.in);
		int no_correct = 0;
		int count = 0;
		int num1 = 0, num2 = 0, answer = -1;
		long startTime, endTime;
		startTime = System.currentTimeMillis();
		do {
			num1 = (int) (1 + (Math.random() * 15));
			num2 = (int) (1 + (Math.random() * 15));
			System.out.print("What is "  + num1 + " + "  + num2 + "?");
			answer = input.nextInt();
			
			if (answer == num1 + num2) {
				no_correct++;
				count++;
				System.out.println("You are correct!!\n");
			}
			else {
				System.out.println("Sorry, you are WRONG....\n");
				count++;
			}
		} while (count != NO_OF_QUESTIONS);
		
		endTime = (System.currentTimeMillis() - startTime) / 1000;
		
		//Displaying Results
		System.out.println("Correct count is "+ no_correct);
		System.out.println("Test time is "+ endTime + " seconds");
		
		
		

	}

}
