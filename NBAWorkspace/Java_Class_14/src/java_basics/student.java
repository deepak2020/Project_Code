package java_basics;

public class student extends Java_day_1{
	
	int a;
	int b;
	public static void main (String [] arg){

		student obj; // Created reference pointing to null;
		obj = new student(); // Objected created and reference set
		
		obj.a = 100;
		obj.b = 20;
		System.out.println(obj.sum()); // No argument passed
		System.out.println(obj.subtract(100, 100)); // Argument
		
//		Java_day_1 obj1 = new Java_day_1();
//		obj1.subtract(100, 50);
		
	}
	
	
	public  Integer sum(){
		int sum =a+b;
		return sum;
	}
}
