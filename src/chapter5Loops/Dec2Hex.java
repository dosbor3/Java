/*7-7-2021
 * This program prompts the user to enter a decimal number and converts it into a hex number as a string
 * 
 * ALGORITHM
 * 1.  Setup program to retrieve user input
 * 2.  Prompt the user to enter a decimal number 
 * 3.  Convert the decimal number into a hex number as a string
 * 4.  Display the results to the user
 * 
 */
package chapter5Loops;

import java.util.Scanner;

public class Dec2Hex {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a decimal number:   ");
		int decimal = input.nextInt();
		
		String hex = "";
		
		
		//using a while loop that executes so long as decimal is not equal to 0
		while (decimal != 0) {
			int hexValue = decimal % 16;
			
			//Convert a decimal into hex digit, using shorthand if/else statement
			char hexDigit = (hexValue <= 9 && hexValue > 0) ? (char)(hexValue + '0') : (char)(hexValue - 10 + 'A');
			
			hex = hexDigit + hex;
			decimal = decimal / 16;
		}
		System.out.println("The hex number is " + hex);

	}

}
