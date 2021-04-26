/*
 * Mrs. James ~ 03/30/21 ~ Period 8
 * ALGORITHM
 * 1. Setup the program to retrieve user input
 * 2. Prompt the user to enter today's day in the form of an integer (Sunday is 0, Monday is 1, etc...)
 * 3. Store the user's input for the day of the week
 * 4. Prompt the user to enter the number of elapsed days since today
 * 5. Store the user's input for the number of elapsed days
 * 6. Create a variable that will hold the String representation for days (Monday, Tuesday, Wednesday, etc..)
 * 7. Determine today's day based on user's input 
 * 8. Create a variable that will hold the String representation for furtureDay
 * 9. Determine future day based on user's input
 * 10. Display results to user
 */
package chapter4SelectionStatements;

import java.util.Scanner;	//Step 1.

public class FindFutureDates {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	//Step 1.
		
		System.out.print("Enter today's day: ");	//Step 2.
		int today = input.nextInt();	//Step 3.
		
		System.out.print("Enter the number of days elapsed since today: ");	//Step 4.
		int elapsedDays = input.nextInt();	//Step 5.
		
		String nameForToday = "";		//Step 6.
		
		/*
		 * For the total number of decisions that has to be made when using multi-way selection statements
		 * The first choice is ALWAYS an if statement.... Every choice after except for the final choice is 
		 * an else if statement.  The final choice should be an else statement
		 */
		
		/*
		 * The syntax for an if statement..... if(conditional statement) { ENTER
		 * The syntax for an else if statement..... else if (conditional statement) { ENTER
		 * The syntax for an else statement..... else { ENTER
		 */
		
		//Step 7.
		if(today == 0) {
			nameForToday = "Sunday";
		}
		else if (today == 1) {
			nameForToday = "Monday";
		}
		else if (today == 2) {
			nameForToday = "Tuesday";
		}
		else if (today == 3) {
			nameForToday = "Wednesday";
		}
		else if (today == 4) {
			nameForToday = "Thursday";
		}
		else if (today == 5) {
			nameForToday = "Friday";
		}
		else if (today == 6) {
			nameForToday = "Saturday";
		}
		else {
			System.out.println("INVALID DATA...");
		}
		
		//Step 8.
		String futureDayString= "";
		
		//Step 9.
		if ((today + elapsedDays) % 7 == 0) {
			futureDayString = "Sunday";
		}
		
		if ((today + elapsedDays) % 7 == 1) {
			futureDayString = "Monday";
		}
		
		if ((today + elapsedDays) % 7 == 2) {
			futureDayString = "Tuesday";
		}
		
		if ((today + elapsedDays) % 7 == 3) {
			futureDayString = "Wednesday";
		}
		
		if ((today + elapsedDays) % 7 == 4) {
			futureDayString = "Thursday";
		}
		
		if ((today + elapsedDays) % 7 == 5) {
			futureDayString = "Friday";
		}
		
		if ((today + elapsedDays) % 7 == 6) {
			futureDayString = "Saturday";
		}
		
		//Step 10.
		System.out.println("Today is " + nameForToday + " and the future day is " + futureDayString);
	}
}