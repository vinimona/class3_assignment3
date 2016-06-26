// Write a java program which generates a random number such that 0 <= Random Number <= N-1 * where N is a given input number.
// Using classes, object and methods

package Class3_assignments;
import java.util.Scanner;
import java.util.Random;

public class class3_assignment3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		Scanner scan_in = new Scanner(System.in);
		System.out.println("Enter a number : ");
		num = scan_in.nextInt();
		
		Random rn = new Random();
		System.out.println("Random number (such that 0 <= Random Number <= N-1) is " + rn.nextInt(num) + ".");
		
		if (scan_in != null)
			scan_in.close();
		
	}

}
