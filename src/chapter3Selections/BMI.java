/*
 * This program allows a user to enter weight, feet, and inches and uses the input to 
 * calculate BMI
 */
package chapter3Selections;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter weight in pounds:\t");
		double weight = input.nextDouble();
		
		System.out.print("Enter feet:\t");
		double feet = input.nextDouble();
		
		System.out.print("Enter inches: \t");
		double inches = input.nextDouble();
		
		//convert weight to kilograms
		double weightInKilograms = weight * 0.45359237;
		
		//convert feet to inches
		double feet_to_inches = feet * 12;
		
		//sum feet_to_inches and inches entered by user
		double total_inches = inches + feet_to_inches;
		
		//convert total_inches to meters
		double total_inches_to_meters = total_inches * 0.0254;
		
		//Calculate BMI --> weight in kilograms / height in meters squared
		double BMI = weightInKilograms / Math.pow(total_inches_to_meters, 2);
		
		//Display BMI value to user
		System.out.println("BMI is " + BMI);
		
		//Display BMI category to user
		if( BMI < 18.5) {
			System.out.println("Underweight");
		}
		else if (BMI >= 18.5 && BMI < 25 ) {
			System.out.println("Normal");
		}
		else if (BMI >= 25 && BMI < 30 ) {
			System.out.println("Overweight");
		}
		else {
			System.out.println("Obese");
		}
		

	}

}
