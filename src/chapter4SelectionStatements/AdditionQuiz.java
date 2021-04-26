/*
 * Mrs. James ~ 3/2/21 ~ Period 6
 * 
 * ALGORITHM
 * Step 1.  Setup program to retrieve user input
 * Step 2.  Generate two random single-digit integers
 * Step 3.  Display an addition problem to the user
 * Step 4.  Retrieve user's answer
 * Step 5.  Compare user's answer to correct sum and display true or false to user
 * Step 6.  Display results to user as true or false
 */
package chapter4SelectionStatements;

//import Scanner Class -->Step 1
import java.util.Scanner;

public class AdditionQuiz {
	public static void main(String[] args) {
		
		//Create Scanner Object --> Step 1
		Scanner input = new Scanner(System.in);		
		
		//Assignment Statements for generating random numbers --> Step 2
		int number1 = (int)(System.currentTimeMillis() % 10);
		int number2 = (int)(System.currentTimeMillis() / 7 % 10);			
		
		//Display the addition problem to the user --> Step 3
		System.out.print("What is " + number1 + " + " + number2 + "? ");
		
		//Store user's input --> Step 4
		int answer = input.nextInt();
		
		//Figure out how to implement Step 5
		System.out.println(number1 + " + " + number2 + " = " + answer + " is " + (number1 + number2 == answer));
			
	}

}
