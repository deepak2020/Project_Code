package Package_1;

public abstract class Public_Access {

	public static void main(String[] args) {
		A obj = new A();
		System.out.println(obj.sum(10, 20));
//		Public_Access obj1 = new Public_Access();
//		obj1.salary();
//		atmPin();

	}
	
	public static void publicMethod(){
		System.out.println("I am public method");
		atmPin();
	}
	
	public abstract void  calculation();
	
	protected static  void atmPin(){
		System.out.println("You got me");
	}

}
