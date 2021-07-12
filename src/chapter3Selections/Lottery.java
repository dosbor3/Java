/* 5/3/21
 * The program randomly generates a lottery of a two-digit number, prompts the user to enter a two-digit number and 
 * determines whether the user wins according to the following rules:
 * 1.  If the user input matches the lottery number in the exact order, the award is $10,000
 * 2.  If all digits in the user input match all digits in the lottery number, the award is $3,000
 * 3.  If one digit in the user input matches a digit in the lottery number, the award is $1000
 */
package chapter3Selections;

import java.util.Scanner;
public class Lottery {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int lottery = (int)(Math.random() * 1000 / 10);
		System.out.println(lottery);
		
		System.out.print("Enter your lottery number guess:\t");
		int guess = input.nextInt();
		
		int ldigit_1 = lottery / 10;
		int ldigit_2 = lottery % 10;
		
		int udigit_1 = guess / 10;
		int udigit_2 = guess % 10;
		
		if (guess == lottery) {
			System.out.println("Congratulations!!! You win $10,000");
		}
		else if (udigit_1 == ldigit_2 && udigit_2 == ldigit_1) {
			System.out.println("You matched two digits, you win $3,000");
		}
		else if((( udigit_1 == ldigit_1 || udigit_1 == ldigit_2)) || ((udigit_2 == ldigit_1 || udigit_2 == ldigit_2))) {
			System.out.println("You matched one digit, you win $1,000");			
		}
		else {
			System.out.println("Sorry.... You did not win.");
		}
		
	}

}
