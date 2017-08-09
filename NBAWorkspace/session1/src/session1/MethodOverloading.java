package session1;

public class MethodOverloading extends MethodOverriding {
	@Override
	public void print() {
		System.out.println("I am not overriding method");
	}

	public static void main(String[] args) {
		
		MethodOverloading shital = new MethodOverloading(); // Constructor
		shital.sum(10, 20, 20);
		shital.sum(30, 20);
		shital.sum("Number is ", 100);
		shital.sum(1000, "  Number");
		shital.print();

		MethodOverriding deepak = new MethodOverriding();
		deepak.print();
	}
	
	public void sum(int a,int b, int c){
		System.out.println(a+b+c);
		
	}
	
	public void sum(int a,int b){
		System.out.println(a+b);
		
	}
	
	public void sum(String a,int b){
		System.out.println(a+b);
		
	}
	
	public void sum(int b, String a){
		System.out.println(a+b);
		
	}
	
	
	
	
}
