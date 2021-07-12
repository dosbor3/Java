/* 4/28/21
 * This program prompts the user to enter the first 9 digits of an ISBN-10 (International Standard Book Number)
 * and calculate the checksum using the following formula
 * (d1 x 1 + d2 x 2 + d3 x 3...... d9 x 9) % 11. If the checksum is 10, the last digit is denoted as X
 * 
 */
package chapter3Selections;

import java.util.Scanner;

public class ISBNCheck {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first 9 digits of an ISBN as integer:\t");
		int isbn_9 = input.nextInt();
		
		//Sorting out digits
		int d1 = isbn_9 % 1000000000 / 100000000;
		int d2 = isbn_9 % 100000000 / 10000000;
		int d3 = isbn_9 % 10000000 / 1000000;
		int d4 = isbn_9 % 1000000 / 100000;
		int d5 = isbn_9 % 100000 / 10000;
		int d6 = isbn_9 % 10000 / 1000;
		int d7 = isbn_9 % 1000 / 100;
		int d8 = isbn_9 % 100 / 10;
		int d9 = isbn_9 % 10 ;
		
		int checksum = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9)  % 11;
		
		
		if (checksum == 10) {
			System.out.print("The ISBN-10 number is ");
			System.out.print(d1);
			System.out.print(d2);
			System.out.print(d3);
			System.out.print(d4);
			System.out.print(d5);
			System.out.print(d6);
			System.out.print(d7);
			System.out.print(d8);
			System.out.print(d9);
			System.out.print("X");
		}
		else {
			System.out.print("The ISBN-10 number is ");
			System.out.print(d1);
			System.out.print(d2);
			System.out.print(d3);
			System.out.print(d4);
			System.out.print(d5);
			System.out.print(d6);
			System.out.print(d7);
			System.out.print(d8);
			System.out.print(d9);
			System.out.print(checksum);
		}
		
		
		
	}

}
