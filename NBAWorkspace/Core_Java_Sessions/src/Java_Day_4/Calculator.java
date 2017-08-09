package Java_Day_4;

public class Calculator extends Sesssion_Abstract {

	public static void main(String[] args) {
		Calculator obj = new Calculator();
		obj.subtract(10, 20);
		obj.sum(20, 30);
		obj.multiply(40, 50);
		obj.division(10, 2);

	}

	@Override
	public void sum(int a, int b) {
		System.out.println(a+b);
		
	}

	@Override
	public void multiply(int a, int b) {
		System.out.println(a*b);
		
	}

	@Override
	public void division(int a, int b) {
		System.out.println(a/b);
		
	}

}
