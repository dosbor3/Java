/* 04/27/21
 * This program will generate three single-digit integers and prompt the user to enter the sum of the three
 */
package chapter3Selections;

import java.util.Scanner;

public class AddThreeNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Randomly generate three single-digit integers
		int number1 = (int) (Math.random() * 10);
		int number2 = (int) (Math.random() * 10);
		int number3 = (int) (Math.random() * 10);
		
		//Prompt the user to find the sum of all three
		System.out.print("What is the sum of " + number1 + " + " + number2 + " + " + number3 + " ?\t");
		int answer = input.nextInt();
		
		if (answer == (number1 + number2 + number3)) {
			System.out.println("Correct! " + number1 + " + " + number2 + " + " + number3 + " is " + answer);
		}
		else {
			System.out.println("WRONG.. " + number1 + " + " + number2 + " + " + number3 + " is NOT " + answer);
		}

	}

}
