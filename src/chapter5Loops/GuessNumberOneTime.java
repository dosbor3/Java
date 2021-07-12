/* 5/25/21
 * This program generates a random number between 0 and 100 inclusive.  Prompts the user to guess the number, and compares the user input
 * to the randomly generated number.  Finally, informs the user of the result
 * 
 * ALGORITHM
 * 1.  Setup program to retrieve user input
 * 2.  Randomly generate an integer between 0 and 100 inclusively 
 * 3.  Prompt the user to enter a guess
 * 4.  Compare user's input to randomly generated integer
 * 5.  Display the results
 */
package chapter5Loops;

import java.util.Scanner;
public class GuessNumberOneTime {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num = (int)(Math.random() * 100);
		System.out.println(num);
		
		System.out.print("Guess a magic number between 0 and 100:  ");
		int guess = input.nextInt();
		
		if (guess == num) {
			System.out.println("You Got it!  Great Guess!!");
		}
		else if (guess > num) {
			System.out.println("Hummm.... You're a little too high....go lower..");
		}
		else if (guess < num) {
			System.out.println("Oh No.... You're too low..... go higher....");
		}
		else {
			System.out.println("Sorry, you did not guess correctly");
		}

	}

}
