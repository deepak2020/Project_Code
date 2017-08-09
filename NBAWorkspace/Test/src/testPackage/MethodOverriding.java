package testPackage;

public class MethodOverriding extends mathematic {

	void operation(){
		System.out.println("I am adding operation");
	}
	
	public static void main(String[] args) {
		MethodOverriding obj = new MethodOverriding();
		obj.operation();
		
		mathematic obj2 = new mathematic();
		obj2.operation();	
	}
}
class mathematic{
	void operation(){
		System.out.println("I am mathematic operation");
	}
}
