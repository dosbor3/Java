/*Mrs. James ~ Jan 27 ~ Period 6
 * Use the comments to assist you in code implementation, this type of source code is known as a code shell
 */
//place your package here.... Replit users, you do NOT have a package...Eclipse.. it may be demo as the package
package demo;

//import the Scanner class
import java.util.Scanner;

public class SalesTax {

	//define the main method
	public static void main(String[] args) {
		
		//Create a Scanner object named input
		Scanner input = new Scanner(System.in);


		//Prompt the user... "Enter purchase amount: "
		System.out.print("Enter Purchase Amount: ");

		//create the purchaseAmount variable and store the user's input within it
		double purchaseAmount = input.nextDouble();

		//calculate the sales tax ( purchaseAmount * 0.06) and store it in a variable named tax
		double tax = purchaseAmount * 0.06;

		//calculate the  total purchase amount and store it in the variable named total_purchaseAmount
		double total_purchaseAmount = purchaseAmount + tax;

		//Display the sales tax to the user "Sales Tax:     Hint...use type cast and ((tax * 100) / 100.0) in the print statement"
		System.out.println("Sales Tax:$" + (int)((tax * 100) / 100.0));

		//Display the total_purchaseAmount to the user   "Purchase Total: "
		System.out.println("Total Purchase Amount (includes tax): $" + total_purchaseAmount);


	}

}