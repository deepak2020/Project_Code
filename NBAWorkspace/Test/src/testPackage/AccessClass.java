package testPackage;

public class AccessClass extends AbstractClass {
	public void sumAgain(int a, int b) {
		int sum  = (a+b);
		System.out.println(sum);
		}
		
	

	public static void main(String[] args) {
		TestClass obj = new TestClass();
		obj.sum(90, 100);
		obj.subtract(100, 50);
		AbstractClass obj1 = new AccessClass();
		obj1.sumAgain(10, 20);
		
	}


}
