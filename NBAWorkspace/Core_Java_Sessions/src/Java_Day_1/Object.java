package Java_Day_1;

public class Object {
	
	Object(){
		 // Constructor is a default method created with class to initialize an object
	}
	
	int age; // properties
	String name; // properties

	public static void main(String[] args) {
		Object obj; // reference creation
		obj = new Object(); //Constructor // initializing object with the help of constructor
		obj.run(); // We are accessing object with the help of reference.
		obj.eat();

	}
	
	
	public void run(){
		System.out.println("I can run");  // behavior
	}
	
	public void eat(){
		System.out.println("I can eat"); // behavior
	}
	

}
