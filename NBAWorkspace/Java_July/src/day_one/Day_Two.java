package day_one;

public class Day_Two {
	
	 int age;
	String name;
	

	public static void main(String[] args) {
		Day_Two deepak = new Day_Two();
		deepak.run();
		deepak.age=39;
		deepak.name="Deepak Rana";
		deepak.printCharcterstics();
		deepak.walk();
		deepak.run();
		
	 Calculator obj = new Calculator();
	 obj.sum();
		
	}
	
	
	public   void run(){
		System.out.println("I can Run");
	}
	
	public void eat(){
		System.out.println("I can eat");
	}
	
	
	public void walk(){
		System.out.println("I can walk");
	}

	public void printCharcterstics(){
		System.out.println(age);
		System.out.println(name);
	}

}
