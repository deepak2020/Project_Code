package java_Day_6;

public class Constructor {

	Constructor() {
		System.out.println("I am default constructor mein yahan hoon");
	}

	Constructor(int a, int b) {
		System.out.println(a+b);
	}

	Constructor(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	Constructor(int a, String b) {
		System.out.println(a+b);
	}
	
	Constructor(String a, int b) {
		System.out.println(a+b);
	}
	
	
	int a;
	int b;
	public static void main(String[] args) {

		Constructor obj = new Constructor();
		Constructor obj1 = new Constructor(10, 20);
		Constructor obj2 = new Constructor(10, 20, 30);
		Constructor obj3 = new Constructor(10, "I am string");

	}
	
	public void sum (){
		System.out.println("I am Super class"+ " "+(a+b));
	}

}
