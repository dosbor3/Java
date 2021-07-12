/* 7-7-2021
 * This program displays the first 50 prime numbers in five lines, each only displaying 10 numbers
 * 
 * ALGORITHM:
 * 1.  Determine whether a given number is prime
 * 2.  For number = 2, 3, 4, 5, 6, .... test whether it is prime
 * 3.  Count the prime numbers
 * 4.  Display each prime number, and display ten numbers per line
 */
package chapter5Loops;

public class DisplayingPrimeNumbers {

	public static void main(String[] args) {
		final int NO_OF_PRINTED_PRIMES = 50;
		int number = 2, count = 0;
		
		System.out.println("The first 50 prime numbers are \n");
				
		while ( count < NO_OF_PRINTED_PRIMES) {
			
			boolean isPrime = true;
			
			for( int divisor = 2; divisor <= number / 2; divisor++) {
				if (number % divisor == 0) {
					isPrime = false;
					break; //Exit the for loop
				}
			}
			
			if(isPrime) {
				count++;
				
				if (count % 10 == 0) {
					System.out.println(number);
				}
				else {
				System.out.print(number +"\t");
				}
			}
			number++;
		}
	}
}