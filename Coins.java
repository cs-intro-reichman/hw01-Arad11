/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {
		final int QUARTER_EQUALITY = 25;
		int coinsAmount = Integer.parseInt(args[0]);
		int quartersAmount = coinsAmount / QUARTER_EQUALITY;
		int centsAmount = coinsAmount % QUARTER_EQUALITY;

		System.out.println("Use " + quartersAmount + " quarters and " + centsAmount + " cents");
	}
}