package testPackage;

public class methodOverriding1 extends Methods{
	
	int a = 1000;
	public void sum(int a, int b) {
		int multplication = a*b;
		System.out.println(multplication);
	}

	public static void main(String[] args) {

		methodOverriding1 obj = new methodOverriding1();
		obj.sum(10, 30);
	}

}
