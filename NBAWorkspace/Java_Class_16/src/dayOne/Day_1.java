package dayOne;

public class Day_1 {

	public static void main(String[] args) {
		System.out.println("Hello World");
		sum();
		
		Day_1 obj = new Day_1();
		obj.subtract();
		
		Day_2 tt = new Day_2();
		tt.subtract();
		tt.sum();
	}
	
	public static void sum(){
		System.out.println("I am static method");
	}
	
	
	public  void subtract(){
		System.out.println("I am non static memeber");
		
	}
}

 class Day_2 {

		
	public static void sum(){
		System.out.println("I am static method from DAY_2 class");
	}
	
	
	public  void subtract(){
		System.out.println("I am non static memeber Day_2 class");
		
	}
}
