package Java_Day_1;

public class static_keyword_4 {
	int a; // Instance
	static int b; //
	static int d;
	public static void main(String[] args) {
		static_keyword_4 obj1 = new static_keyword_4();
		obj1.changeValue(10, 20); // value changed by obj1
		obj1.printValue();
		System.out.println("*************Obj2 below*******************");
		// creating another instance
		static_keyword_4 obj2 = new static_keyword_4();
		obj2.printValue();
		System.out.println("*************Obj3 below*******************");
		// creating another instance
		static_keyword_4 obj3 = new static_keyword_4();
		obj3.changeValue(10, 0);
		obj3.printValue();
		
		System.out.println("*************Obj2 below*******************");
		obj2.printValue();
		obj2.divide();
		
	}
	public void changeValue(int num1, int num2) {
		int sum;
		a = num1;
		b = num2;
		sum = a + b;
		d = sum;
	}
	
	public int divide(){
		int a = d/b;
		return a;
	}
	public void printValue() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(d);
	}

}
