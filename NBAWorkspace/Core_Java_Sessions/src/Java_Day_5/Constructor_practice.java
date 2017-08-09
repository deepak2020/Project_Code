package Java_Day_5;

public class Constructor_practice {
	
	public Constructor_practice(){
		
		System.out.println("I am default constructor");
		
	}

	public Constructor_practice(int a, int b) {
		System.out.println(a+b);
	}

	public Constructor_practice(int a, int b, int c) {
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {

		Constructor_practice obj = new Constructor_practice(10, 10); // default
		
		Constructor_practice obj1 = new Constructor_practice(20, 30, 50);
		
		Constructor_practice obj3 = new Constructor_practice();
	}

}
