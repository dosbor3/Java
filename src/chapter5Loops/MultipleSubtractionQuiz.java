/* 5/25/21
 * This program generates five questions and, after a student answers all five, reports the number of correct answers.  
 * The program also displays the time spent on the quiz and lists all the questions
 * 
 * ALGORITHM
 * 1.  Setup program to retrieve user input
 * 2.  Loop the following steps (3 - 5) five times:
 * 3.  Generate two random integers, n2 should ALWAYS be subtracted from n1 and the difference should be positive, so if n1 < n2, swap the two
 * 4.  Prompt the user to enter the difference
 * 5.  Increment score if user answers correctly, decrement score if user doesn't
 * 6.  Display results to user
 */
package chapter5Loops;

import java.util.Scanner;
public class MultipleSubtractionQuiz {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int NO_OF_QUESTIONS = 5;
		int count = 0, score = 0;
		int n1, n2;
		String finalMessage = "";
		long startTime = 0, stopTime = 0;
		
		//Start the clock
		startTime = System.currentTimeMillis() / 1000;			//start the clock
				
		while(count < 5) {
			n1 = (int)(Math.random() * 100);
			n2 =(int)(Math.random() * 100);
			
			//Swap out n1 and n2, if n1 < n2
			if (n1 < n2) {
				int temp = n2;
				n2 = n1;
				n1 = temp;
			}
			
			//Prompt the user to enter the difference between n1 and n2
			System.out.print("What is " + n1 + " - " + n2 + "?  ");
			
			
						
			//System.out.println(startTime);
			int answer = input.nextInt();
			
			if (answer == n1 - n2) {
				score += 1;
				System.out.println("You are correct! " + n1 + " - " + n2 + " equals " + answer + "\n");
				finalMessage += "\n" + n1 + " - " + n2 + " = " + answer + " CORRECT";
			}
			else {
				System.out.println("\nYou are WRONG! " + n1 + " - " + n2 + " does NOT equal " + answer + "\n");
				finalMessage += "\n" + n1 + " - " + n2 + " = " + answer + " WRONG";
			}
			count++;
		}
		stopTime = ((System.currentTimeMillis() / 1000) - startTime);
		//int minutes = (int)(stopTime % 60);
		//int seconds = (int)(stopTime % 60);
		System.out.print("Score: " + score + "/" + NO_OF_QUESTIONS );
		System.out.println(finalMessage);
		System.out.println("Quiz Time:" + ((startTime - stopTime) % 60) + " seconds");
		
		

	}

}
