package testPackage;

public class Constructor {
	int sum;
	int a;
	int b;
	
	Constructor(int e, int f ) {
		a =e;
		b= f;

	}
	public static void main(String[] args) {
		
		Constructor obj = new Constructor(10, 20);
		obj.sum();
	}
	
	public void sum (){
		sum = a+b;
		System.out.println(sum);
		
	}

}
