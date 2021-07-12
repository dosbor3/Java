/* 4/28/21
 * This program prompts the user to enter three integers and display the integers in non-decreasing (ascending)
 * order
 */
package chapter3Selections;

import java.util.Scanner;
public class SortThreeIntegers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter three integers:\t");
		int num1 = input.nextInt(), num2 = input.nextInt(), num3 = input.nextInt();
		
		//Key here is to sort the numbers after retrieval so that n1 is always the
		//smallest and n3 is always the biggest
		//compare num1 and num2 first, if num1 > num2 swap them out.
		if (num1 > num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		//now compare num2 and num3, if num2 is greater than num3 swap them out
		if (num2 > num3) {
			int temp = num2;
			num2 = num3;
			num3 = temp;
		}
		
		//Lastly compare the swapped value of num2 with the value of num1
		if(num1 > num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		//Display the results
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
	}

}
