/* 5/2/21
 * This program allows the user to guess whether the flip of a coin
 * results in heads or tails.  The program randomly generates an integer
 * 0 or 1, which represents head or tail.  The program prompts the user to enter
 * a guess and reports whether the guess is correct or incorrect
 */
package chapter3Selections;

import java.util.Scanner;
public class HeadsOrTails {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int head_tail = (int)(Math.random()* 2);
		String string_head_tail = "";
		if (head_tail == 0) {
			string_head_tail = "heads";
		}
		if (head_tail == 1) {
			string_head_tail = "tails";
		}
		
		int no_guess = -1;
		String string_guess;
		
		System.out.print("Enter your guess (Heads or Tails):\t");
		String guess = input.next();
		
		if (guess.equalsIgnoreCase("heads")) {
			no_guess = 0;
		}
		else if (guess.equalsIgnoreCase("tails")) {
			no_guess = 1;
		}
				
		if (no_guess == head_tail) {
			System.out.println("Correct! The coin flipped on " + string_head_tail);
		}
		else if((no_guess != head_tail) && (no_guess != -1)) {
			System.out.println("Incorrect....The coin flipped on " + string_head_tail);
		}
		else {
			System.out.println("INVALID INPUT....Please Enter Heads or Tails: ");
		}

	}

}
