package testPackage;

public class TestClass {

	public static void main(String[] args) {
		System.out.println("Hello Worlds");
		// sum
		
		TestClass sumnumber = new TestClass();
		sumnumber.sum(10, 20);
		
		boolean sum = true;
		boolean just = false;
		System.out.println(sum);
		System.out.println(just);
		
		short shortnumber = 9999;
		System.out.println(shortnumber);
		int integernumber1 = 999999999;
		System.out.println(integernumber1);
		long longnumber = 999999999999999999L;
		System.out.println(longnumber);
		float n = (float) 10.333333333333333333333333333333333333333;
		System.out.println(n);
		
		double n1 = (double) 10.333333333333333333333333333333333333333;
		System.out.println(n1);
		
		String name = "Deepak";
		System.out.println(name);
		
		
		TestClass obj = new TestClass();
		obj.sum(10, 20);
		obj.subtract(30, 10);
		System.out.println();
	
	
	}
	
	void sum(int a ,int b){
		int sum = a+b;
		System.out.println(sum);
		
	}
	
	void sum(int a ,int b, int c){
		int sum = a+b+c;
		System.out.println(sum);
		
	}

	protected void subtract(int a ,int b){
		int subtract = a-b;
		System.out.println(subtract);
		
	}
	
	
}
