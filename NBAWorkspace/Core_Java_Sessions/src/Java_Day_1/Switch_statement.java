package Java_Day_1;

import java.util.Scanner;

public class Switch_statement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int number = scan.nextInt();
		switch (number) {
		case 10:
			System.out.println("10");
			break;
		case 20:
			System.out.println("20");
			break;
		case 30:
			System.out.println("30");
			break;
		default:
			System.out.println("Not in 10, 20 or 30");

		}
	}
}
