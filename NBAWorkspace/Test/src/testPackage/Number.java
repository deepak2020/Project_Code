package testPackage;

public class Number {

	public static void main(String[] args) {
		int n = 232;

		int primenumber;
		int sum = 0, r = 0;
		int temp;

		temp = primenumber;

		if (n % 2 == 0) {
			primenumber = n;
			;
		}

		while (primenumber > 0) {

			r = primenumber % 10; // getting remainder
			sum = (sum * 10) + r;
			primenumber = primenumber / 10;

		}
		System.out.println("palindrome number " + sum);
		System.out.println("palindrome number1 " + temp);
		if (primenumber == sum)
			System.out.println("palindrome number1 " + primenumber);
	}

}
