package dayOne;

import java.util.Scanner;

public class If_Else {

	public static void main(String[] args) {

		for (int a = 4; a <= 100; a++) {

			boolean isPrime = true;

			for (int i = 2; i < a; i++) {
				if (a % i == 0) {
					isPrime = false;
					break;

				}

			}
			if (isPrime == true) {
				System.out.println("Number is prime " + a);
			}
			// else
			// System.out.println("Number is nonprime " + a);

		}

	}
}
