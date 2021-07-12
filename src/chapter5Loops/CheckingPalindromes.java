/*7-7-2021
 * This program prompts the user to enter a string and reports whether the string is a palindrome
 * 
 * ALGORTIHM
 * 1.  Setup program to retrieve user input
 * 2.  Check whether the first character in the String is the same as the last character
 * 3.  If so, check whether the second character is the same as the second-to-last character.  
 * 4.  Continue process until a mismatch is found, or all the characters in the string are checked, except for the middle character
 * 			if the string has an odd number of characters. * 
 */
package chapter5Loops;

import java.util.Scanner;
public class CheckingPalindromes {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string:   ");
		String word = input.nextLine();
		boolean isPalindrome = false;
		int first = 0,  last = word.length() - 1;		
				
		while(first != last) {
			if (word.charAt(first) == (word.charAt(last))) {
				isPalindrome = true;
				first++;
				last--;
				if (first > word.length() / 2) {
					break;
				}
				
			}
			else {
				isPalindrome = false;
				break;
			}
			
		}
		if(isPalindrome)
				System.out.println(word + " is a palindrome");
		else
			System.out.println(word + " is NOT a palindrome");
	}

}
