package demo;
//Mrs. James ~ Jan 26 ~ Period 6

//This program gives practice utilizing the increment and decrement operators

import java.util.Scanner;


public class Increment_Decrement {
	public static void main(String[] args) {
		
		//variable assignment, initialize i and j to the value of 3
		int i = 3, j = 3;
		
		//Print statement to view results
		System.out.println("i's value before use of the postincrement operator: " + i);
		System.out.println("j's value before use of the postincrement operator: " + j);
		
		//Use the postincrement operator for both variables
		i++;
		j++;
		
		//Print statement to view results
		System.out.println("i's value after the postincrement operator: " + i);
		System.out.println("j's value after the postincrement operator: " + j);
		
		//variable assignment, initialize t and r to the value of 12
		int t = 12, r = 12;
		
		//Use the postdecrement operator for both variables
		t--;
		r--;
		
		//Print statement to view results
		System.out.println("t's value after the postdecrement operator: " + t);
		System.out.println("r's value after the postdecrement operator: " + r);
		
		/**This is a block style comment
		 * The next example will demonstrate the difference in values when the increment and decrement
		 * operators are placed before and after a variable within an expression
		 */
		double x = 10.00;
		double y = 6.0;
		double z = x-- + (++y);
		System.out.println("z's value:" + z);
		
		
		
	}

}
