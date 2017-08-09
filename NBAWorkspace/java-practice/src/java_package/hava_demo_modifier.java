package java_package;

public class hava_demo_modifier {

	static int b = 0; //static variable
	static int c=0;
	 int d;
	
	public static void main(String[] args) {
		
		int a=0; //local variable
		hava_demo_modifier instance = new hava_demo_modifier();
		instance.d = 1234;
		System.out.println(instance.d);
		
		instance.d = 12345;
		System.out.println(instance.d);
		
		instance.d = 123456;
		System.out.println(instance.d);
		
		instance.d = 1234567;
		System.out.println(instance.d);
	
		

	}
	
	public void deepak(String[] args) {
		
		int t=0; //local variable
		System.out.println(b);
		System.out.println(c);
		hava_demo_modifier instance1 = new hava_demo_modifier();
		instance1.d = 12345;
		System.out.println(instance1.d);
		

	}


}
