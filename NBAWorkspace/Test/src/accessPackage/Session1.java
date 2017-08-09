package accessPackage;

interface Session1 {

	public static void main(String[] args) {
		System.out.println("Hello World");
		int a=0;
//		System.out.println(a%a);
		
		boolean decision = true;
		boolean decsion1 = false;
		
		System.out.println(decsion1 +"  and  "+ decision);
		
		byte b = 100;
		int c = 1000000000;
		long d = 100000000000000000L;
		float i = 100000000000000000000000000000000000000.00f;
		double db = 10.00000000000000000000000000000000000000000000000000000000009999999999999999d;
		String str = "Deepak Kumar";
		System.out.println(str);
		
		int num1 = 10;
		int num2 = 20;
		
		int sum = num1+num2;
		System.out.println("Number1 is  "+ num1);
		System.out.println("Number2 is  "+ num2);
		System.out.println("Sum is "+sum);
		
		Session1 obj = new Session1();
		obj.sum(99, 99);
		obj.sum(37, 37);
	}
	
	public void sum(int a, int b);
	}
	
	public void multiply(int a, int b){
		int sum = a*b;
		System.out.println("Multipilcation is "+sum);
	}

}
