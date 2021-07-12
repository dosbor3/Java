/*5/3/21
 * This program displays a random coordinate in a rectangle.  The rectangle is centered at (0,0)
 * with width 100 and height 200
 * 
 */
package chapter3Selections;

public class RandomRectPoint {

	public static void main(String[] args) {
		int rect_x = (int)(Math.random() * 1000 / 10 );
		int rect_y = (int)(Math.random() * 2030 / 10);
		
		System.out.println("The rectangle's random point is (" + rect_x + "," + rect_y + ")");

	}

}
