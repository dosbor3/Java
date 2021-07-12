/* 5/3/21
 * This program prompts the user to enter the weight of the package and display the shipping cost.  
 * If the weight is greater than 50, display a message "The package cannot be shipped"
 */
package chapter3Selections;

import java.util.Scanner;
public class ShippingCost {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
				
		System.out.print("Enter the weight of the package (pounds): ");
		double weight = input.nextDouble();
		
		if (weight > 50) {
			System.out.println("The package cannot be shipped");
			
		}
		else if (weight > 0 && weight <= 1) {
			System.out.println("Package cost is $3.50");
		}
		else if (weight > 1 && weight <= 3) {
			System.out.println("Package cost is $5.50");
		}
		else if (weight > 3 && weight <= 10) {
			System.out.println("Package cost is $8.50");
		}
		else if (weight > 10 && weight <= 20) {
			System.out.println("Package cost is $10.50");
		}

	}

}
