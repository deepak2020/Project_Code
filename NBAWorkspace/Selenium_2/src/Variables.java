import java.util.Calendar;


public class Variables {
	
	int a;
	static int c;

	public static void main(String[] args) {
		
		Variables instance1 = new Variables();
		instance1.changeValue();
		
		Variables instance2 = new Variables();
		instance2.Value();
		Value();
		
	}
	
	
	public void changeValue(){
		a=10;
		c=30;
		System.out.println("Changed value of instance variable a to "+ a);
		System.out.println("Changed value of static variable to " +c);
	}
	
	public static void Value(){
//		System.out.println("Value of instance variablea to "+ a);
		System.out.println("Value of static variable to " +c);
	}
	
	
}
