package Java_Day_1;

public class For_loop {

	public static void main(String[] args) {

		for (int a = 100; a >= 0; a--) {
			if (a % 13 == 0) {
				return;
			}
			System.out.println("************************* number is "+ a);
		}

	}
}
