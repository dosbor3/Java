/* 5/25/21
 * This program generates a random number between 0 and 100 inclusive.  Prompts the user to guess the number, and compares the user input
 * to the randomly generated number UNTIL THE USER GUESSES CORRECTLY.  Finally, informs the user of the result
 * 
 * ALGORITHM
 * 1.  Setup program to retrieve user input
 * 2.  Randomly generate an integer between 0 and 100 inclusively 
 * 3.  LOOP Steps  4- 6 until the user guesses correctly:  
 * 4.  Prompt the user to enter a guess
 * 5.  Compare user's input to randomly generated integer
 * 6.  Display the results
 */
package chapter5Loops;

import java.util.Scanner;
public class GuessNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num = (int)(Math.random() * 100), guess = -1;
		//System.out.println(num); Test for randomly generated number
		
		System.out.println("Guess a magic number between 0 and 100  ");
		
		while( guess != num) {
			System.out.print("Enter your guess:  ");
			guess = input.nextInt();
		
			if (guess == num) {
				System.out.println("\nYou Got it!  Great Guess!!");
			}
			else if (guess > num) {
				System.out.println("\nHummm.... You're a little too high....go lower..");
			}
			else if (guess < num) {
				System.out.println("\nOh No.... You're too low..... go higher....");
			}
			
		}

	}

}
