/* 7-8-2021
 * This program will display a conversion table from kilograms to pounds 
 * using a loop
 */
package chapter5Loops;

public class FiveThreeConversionKiloToPounds {
	public static void main(String[] args) {
		double conversion;
				
		System.out.println("Kilograms\t\tPounds");
		for ( int i = 1; i < 200; i++) {
			conversion = i * 2.2;
			System.out.printf(i + "\t\t\t %4.1f", conversion);
			System.out.println();
		}
	}

}
