package Java_Day_1;

public class HumanBeing {

	public static void main(String[] args) {
		
		HumanBeing deepak = new HumanBeing();
		
		System.out.println(deepak.drink());
		deepak.talk();
		walk();
		eat();
		
		deepak.age=28;
		deepak.name="Deepak Kumar Rana";
	}
	
	public static void walk(){
		System.out.println("I can walk");
	}
	
	public static void eat(){
		System.out.println("I can eat");
	}
	
	public  Integer drink(){
		int n = 123;

		return n;
	}
	
	public  void talk(){
		System.out.println("I can talk");
	}
	
	String name;
	int age;
	
	
}


class abc {
	
	public static void sum(){
		System.out.println("I am sum");
	}
}
