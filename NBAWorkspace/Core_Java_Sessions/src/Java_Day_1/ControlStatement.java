package Java_Day_1;

import java.util.Scanner;



public class ControlStatement {

	public static void main(String[] args) {
		
//		Scanner scan = new Scanner(System.in);
//		int a = scan.nextInt();
//		String name = scan.next();
		Scanner scan = new Scanner(System.in);
		
		int a = 100;
		
		if (a>50){
			System.out.println("Greater "+ a);
		} else if (a<50) {
			System.out.println( "less "+ a);
		} else 
			System.out.println("equal " + a);
	}

}
