
public class Overriding extends Overloading{
	public  Overriding(String a) {
		System.out.println("Hey! I have created object " +a+ " . Bye!!");
	}
	
	public  Overriding(int a) {
		System.out.println("Hey! I have created object " +a+ " . Bye!!");
	}
	
	
	
	int amount;
	public void sum1 (int a, int b, int c){
	System.out.println(a-b);
	super.amount =100;
	this.amount=10;
}

	public static void main(String[] args) {
		
		Overriding obj = new Overriding("obj");
		Overriding obj1 = new Overriding(1);
		
		
	}

}
