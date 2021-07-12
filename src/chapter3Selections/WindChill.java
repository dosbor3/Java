/* 5/5/21
 * This program prompts the user to enter a wind chill and temperature value.  If the range is between - 58 degrees
 * and 41 degrees F and wind speed is greater than or equal to 2 calculate the wind-chill otherwise inform the user 
 * whether the temperature and/or wind speed is invalid
 */
package chapter3Selections;

import java.util.Scanner;
public class WindChill {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter temperature: ");
		double temp = input.nextDouble();
		System.out.println(temp);
		
		
		if ((temp > -58) && (temp < 41 )) {
			System.out.print("Enter wind speed:  ");
			double windSpeed = input.nextDouble();
			
			if (windSpeed >= 2) {
				
				//wind Chill formula --> 35.74 + 0.6215*temp - 35.75 *windSpeed^.16 + 0.4275 * temp * windSpeed
				double windChill = 35.74 + 0.6215 * temp - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * temp * Math.pow(windSpeed, 0.16);
				System.out.println("temperature:\t" + temp + "\nWind Speed\t" + windSpeed + "\nWind Chill:\t" + windChill );
			}
			else {
				System.out.println("Invalid Input.... Wind Speed must be greater than 2 degrees Fahrenheit");
			}
		}
		else {
			System.out.println("Invalid Input.... Temperature range is -58 to 41 degrees Fahrenheit");
		}
	}
}
		
