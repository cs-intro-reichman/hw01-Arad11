/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */

import java.util.Random;

public class GenThree {
	public static void main(String[] args) {
		Random ran = new Random();
		int buttom = Integer.parseInt(args[0]);
		int top = Integer.parseInt(args[1]);
		int firstNum = ran.nextInt(buttom,top);
		int secondNum = ran.nextInt(buttom,top);
		int thirdNum = ran.nextInt(buttom,top);
		int minNum = Math.min(Math.min(firstNum,secondNum), thirdNum);
		System.out.println(firstNum);
		System.out.println(secondNum);
		System.out.println(thirdNum);
		System.out.println("the minimal generated number was "+ minNum);
	}
}
