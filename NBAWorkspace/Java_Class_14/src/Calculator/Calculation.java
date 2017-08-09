package Calculator;

import java.util.Scanner;

public class Calculation extends Calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Calculator obj = new Calculator();
//		int sum = obj.sum(scan.nextInt(), scan.nextInt());
//		System.out.println(sum);
//		int subtract = obj.subtract(scan.nextInt(), scan.nextInt());
//		System.out.println(subtract);
//		System.out.println(obj.division(scan.nextInt(), scan.nextInt()));
//		System.out.println(obj.multiply(scan.nextInt(), scan.nextInt()));
//		
//		System.out.println("**********************************************");
//		Calculation obj1 = new Calculation();
//		
//		int sum1= obj1.sum(10, 300);
//		System.out.println(sum1);
//		int subtract1 = obj1.subtract(100, 40);
//		System.out.println(subtract1);
//		System.out.println(obj1.division(400, 10));
//		System.out.println(obj1.multiply(100, 10));
		
		int output = obj.Calc(scan.nextInt(), scan.next(),scan.nextInt());
		System.out.println(output);
		

	}

}
