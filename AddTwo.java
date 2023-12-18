/*
 * Adds two given integers and prints the result in a fancy way.
 */
public class AddTwo {
	public static void main(String[] args) {
		int firstArg = Integer.parseInt(args[0]);
		int secoundArg = Integer.parseInt(args[1]);
		System.out.println(args[0] + " + " + args[1] + " = "+ (firstArg+secoundArg));
	}
}
