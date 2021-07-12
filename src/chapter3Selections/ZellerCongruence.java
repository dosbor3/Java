/* 5/10/21
 * This program prompts the user to enter a year, month, and day of the month, and 
 * displays the name of the day of the week based on Zeller's congruence.  The formula is
 * h = (q + ((26(m+1))/10) + k + (k/4) + (j/4) + 5 * j) % 7
 * where h is the day of the week(0:Saturday - 6:Friday); q is the day of the month; m is the month (3: March - 12:
 * December) Jan and Feb are 13 and 14 of the previous year
 * j is the century.... year / 100
 * and k is the year of the century year % 100 
 */
package chapter3Selections;

import java.util.Scanner;

public class ZellerCongruence {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter year (e.g., 2012):\t");
		int year = input.nextInt();
		
		System.out.print("Enter Month: 1 - 12:\t");
		int month = input.nextInt();
		
		System.out.print("Enter the day of  the month: 1 - 31:\t");
		int day = input.nextInt();
		
		//Variable Declaration
		int j = 0;
		int k = 0;
		int m = 0;
		String stringDay = "";
		
		//converting month input from user to match formula
		if (month == 1) {			
			year --;
			m = 13;
		}
		else if (month == 2) {
			year --;
			m = 14;
		}
		else if (month !=0 ) {
			m = month;
		}
		else {
			System.out.println("IVALID MONTH INPUT.....");
		}
		
		//Converting year
		j = year / 100;
		k = year % 100;
				
		int day_of_wk = (day + ((26 * (m + 1)/10)) + k + (k/4) + (j/4) + 5 * j) % 7;
				
		switch(day_of_wk) {
		case 0: stringDay = "Saturday";
				break;
		case 1: stringDay = "Sunday";
				break;
		case 2: stringDay = "Monday";
				break;
		case 3: stringDay = "Tuesday";
				break;
		case 4: stringDay = "Wednesday";
				break;
		case 5: stringDay = "Thurdsay";
				break;
		case 6: stringDay = "Friday";
				break;
		default: System.out.println("Error: invalid entry");
		}
		System.out.println("\nDay of the week is " + stringDay);
		
		
		

	}

}
