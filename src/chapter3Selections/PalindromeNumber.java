/*4/28/2021
 * This program prompts the user to enter a three-digit integer and determines whether
 * it is a palindrome number.  Recall a number is a palindrome if it reads the same from 
 * right to left and from left to right.
 * 
 */
package chapter3Selections;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a three-digit integer:\t");
		int number = input.nextInt();
		
		if ((number / 100) == (number % 10)) {
			System.out.println(number + " is a palindrome");
		}
		else {
			System.out.println(number + " is NOT a palindrome");
		}
	}

}
