package session1;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Words {
	
	static char[] alphabet = "trewasdfghjijn".toCharArray();
	static String word;
	static void generate(StringBuilder sb, int n) throws FileNotFoundException {
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner("//session1//src//session1//dictonary");
		if (n == sb.length()) {
			if(sb.toString().startsWith("t")){
				if(sb.toString().endsWith("n"))
					while(scanner.hasNextLine()){
						 System.out.println("Word in the next line "+ scanner.nextLine().trim());
						word = sb.toString();
						//System.out.println(word);
					     if(word.equals(scanner.nextLine())){
					    	 System.out.println("Word in the next line "+ scanner.nextLine());
					       // System.out.println(word);
					        break;
					      }
					      }
				 }
			return;
			}
		
		for (char letter : alphabet) {
			sb.setCharAt(n, letter);
			generate(sb, n + 1);
		}
		
		
	}

	public static void main(String[] args) throws FileNotFoundException {
		StringBuilder sb = new StringBuilder();
		for (int length = 5; length >= 5; length++) {
			sb.setLength(length);
			generate(sb, 0);
			
			
		}
	}
	
	
	
}
