/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */

import java.util.Random;

public class GenThree {
	public static void main(String[] args) {
		Random ran = new Random();
		int bottom = Integer.parseInt(args[0]);
		int top = Integer.parseInt(args[1]);

		if ( top < bottom ) {
			int temp = top;
			top = bottom;
			bottom = temp;
		}
		int firstNum = ran.nextInt(bottom, top);
		int secondNum = ran.nextInt(bottom, top);
		int thirdNum = ran.nextInt(bottom, top);

		int minNum = Math.min(Math.min(firstNum, secondNum), thirdNum);
		System.out.println(firstNum);
		System.out.println(secondNum);
		System.out.println(thirdNum);
		
		System.out.println("The minimal generated number was " + minNum);
	}
}
