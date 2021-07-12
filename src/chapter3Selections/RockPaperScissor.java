/* 5/3/21
 * The program plays the popular rock-paper-scissor game.  A scissor can cut paper, a rock can knock a scissor, and a paper can wrap a rock
 * The program randomly generates a number 0, 1, or 2 representing scissor, rock, and paper.  The program prompts the user to enter a number
 * 0, 1, or 2 and display a message indicating whether the user or the computer wins, loses, or draws
 */
package chapter3Selections;

import java.util.Scanner;
public class RockPaperScissor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number = (int)(Math.random() * 3);
		//System.out.print(number);
		
		System.out.print("Scissor (0), rock (1), paper (2):   ");
		int choice = input.nextInt();
		
		switch (number) {
		case 0: {
			System.out.print("The computer is Scissor.");
			if ( choice == 0) {
				System.out.print("You are scissors too.");
				System.out.print("It is a draw. ");
			}
			else if (choice == 1) {
				System.out.print("You are a rock. ");
				System.out.print("You win");
			}
			else if (number == 2) {
				System.out.print("You are a paper. ");
				System.out.print("You loose");
			}
			break;
		}
		case 1: {
			System.out.print("The computer is rock.");
			if ( choice == 0) {
				System.out.print("You are scissor. ");
				System.out.print("You loose");
			}
			else if (choice == 1) {
				System.out.print("You are rock too.");
				System.out.print("It is a draw. ");
			}
			else if (number == 2) {
				System.out.print("You are a paper. ");
				System.out.print("You win");
			}
			break;
		}
		
		case 2: {
			System.out.print("The computer is paper.");
			if ( choice == 0) {
				System.out.print("You is scissor. ");
				System.out.print("You win");
			}
			else if (choice == 1) {
				System.out.print("You are a rock. ");
				System.out.print("You loose");
			}
			else if (number == 2) {
				System.out.print("You are paper too.");
				System.out.print("It is a draw. ");
			}
			break;
		}
		}
	}
}
		
		
		
		
