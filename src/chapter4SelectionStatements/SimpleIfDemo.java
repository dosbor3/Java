package chapter4SelectionStatements;

/*
 * Mrs. James ~ 4/20/21 ~ Period 6
 * ALGORITHM
 * 1.  Setup program to retrieve user input
 * 2.  Prompt the user to enter an integer
 * 3.  Store the user's input (Create a variable to hold the integer the user inputs)
 * 4.  Determine if the integer is divisible by 5
 * 5.  Determine if the integer is divisible by 2
 * 6.  Display results to user
 */

import java.util.Scanner; //Step 1.
public class SimpleIfDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	//Step1.
				
		System.out.print("Enter an integer:   ");		//Prompt the user Step 2.
		int number = input.nextInt();	//Step 3.
		
		//Selection statement (one-way if statement)
		//Determine if number is divisible by 5 Step 4.
		if (number % 5 == 0) {
			System.out.println("HiFive!!");
		}
		
		//Determine if number is divisible by 2 Step 5.
		if (number % 2 == 0) {
			System.out.println("HiEven!!");
		}
		
		
		
	}
	

}
