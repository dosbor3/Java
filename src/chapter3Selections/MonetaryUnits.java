package chapter3Selections;
//Mrs. James ~ 04/06/2021 ~ Period 8

/*ALGORITHM
 * 1. Setup program to retrieve user input
 * 2. Prompt the user to enter amount
 * 3. Store the amount the user entered
 * 4. Create a variable to hold the remaining amounts
 * 
 */
import java.util.Scanner;
public class MonetaryUnits {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an amount, for example, 11.58		");
		double amount = input.nextDouble();
		
		int remainingAmount = (int)(amount * 100);
		
		
		int dollars = remainingAmount / 100;
		remainingAmount %= 100;
		
		
		int quarters = remainingAmount / 25;
		remainingAmount %= 25;
		
		
		int dimes = remainingAmount / 10;
		remainingAmount %= 10;
		
		
		int nickels = remainingAmount / 5;
		remainingAmount %= 5;
		
		
		int pennies = remainingAmount;
		
		
		System.out.println("Your amount of " + amount + " consists of ");
		
		//dollars Print Statements
		if (dollars > 1 ) {
			System.out.println(dollars + " dollars");
		}
		else if (dollars == 1){
			System.out.println(dollars + " dollar");
		}
		
		//quarters Print Statements
		if (quarters > 1 ) {
			System.out.println(quarters + " quarters");
		}
		else if (quarters == 1){
			System.out.println(quarters + " quarter");
		}
		
		//dimes Print Statements
		if (dimes > 1 ) {
			System.out.println(dimes + " dimes");
		}
		else if (dimes == 1){
			System.out.println(dimes + " dime");
		}
		
		//nickels Print Statements
		if (nickels > 1 ) {
			System.out.println(nickels + " nickels");
		}
		else if (nickels == 1){
			System.out.println(nickels + " nickel");
		}
		
		//Pennies Print Statements
		if (pennies > 1 ) {
			System.out.println(pennies + " pennies");
		}
		else if (nickels == 1){
			System.out.println(pennies + " penny");
		}
		
		
		
		
		
		
		
		
		
	}

}
