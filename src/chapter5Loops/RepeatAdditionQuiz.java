/* 5/24/21
 * This program generates two single digit integers and creates an addition problem.  Prompts the user for the correct response.  If the user answers 
 * incorrectly, the user is able to repeatly enter a new answer until it is correct
 */
package chapter5Loops;

import java.util.Scanner;

public class RepeatAdditionQuiz {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num1 = (int)(Math.random() * 10);
		int num2 = (int)(Math.random() * 10);
		int sum = num1 + num2;
		
		System.out.print("What is the sum of " + num1  + " + " + num2 + "?  "  );
		int answer = input.nextInt();
		
		while (answer != sum){
			System.out.println("\nWrong Answer. Try Again. \n\nWhat is the sum of " + num1  + " + " + num2);
			answer = input.nextInt();
		}
		System.out.println("You Got it!!");

	}

}
