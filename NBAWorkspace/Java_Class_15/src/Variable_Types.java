public class Variable_Types {

	static int a;
	int c;

	public static void main(String[] args) {

		Variable_Types obj = new Variable_Types();
		obj.printValue();
		obj.changeValue(100);
		obj.printValue();
		
		System.out.println("**************************************");
		
		Variable_Types obj1 = new Variable_Types();
		obj1.printValue();
		obj1.changeValue(50);
		obj1.printValue();
		
		System.out.println("**************************************");
	
		obj.printValue();
	}

	public void printValue() {
		System.out.println("Value of  a"+ a);
		System.out.println("Value of  c"+ c);
	}

	public void changeValue(int b) {
		a = b;
		c = 100;
		

	}

}
