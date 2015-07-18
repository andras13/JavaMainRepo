package assignment1_1;

import java.util.Scanner;

public class Assignment1_1 {

	public static void main(String[] args) {

		int sum = 0;
		System.out.println("Enter a number: ");

		Scanner input = new Scanner(System.in);
		int n = input.nextInt(); /* Integer.MAX_VALUE; */

		for (int x = 0; x < n; x++) {
			if (x % 3 == 0 || x % 5 == 0) {
				sum += x;
			}
		}

		System.out.println("The sum of multiplies of 3 and 5 below " + n + " is " + sum);
	}

}

// For me above the input value = 2 090 000 the program outputs a negative value
// But the highest int value is 2 147 483 647; 9 223 372 036 854 775 807;
