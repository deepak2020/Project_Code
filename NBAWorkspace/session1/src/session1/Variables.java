package session1;

public class Variables {
	int a=0;
	int b=0;
	String stats = "Balance is 10000";
	public static void main(String[] args) {	
		
		Variables obj = new Variables();
		obj.sum();
		
		Variables obj1 = new Variables();
		obj1.sum1();
		
		
	}
	public void sum(){
		a= 100;
		b= 100;
		stats = "Balance is 100";
		System.out.println(a);
		System.out.println(b);
		System.out.println(stats);
		}
	
	public void sum1(){		
		System.out.println(a);
		System.out.println(b);
		System.out.println(stats);
	}
}