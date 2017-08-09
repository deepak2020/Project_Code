package Java_Day_4;

public class Polymorphism {

	public static void main(String[] args) {
		

	}
	
	
	//Method overloading
	public void sum(int a, int b){
		System.out.println(a+b);
	}

	public void sum(int a, int b, int c){
		System.out.println(a+b+c);
	}
	
	public void sum(int a, int b, int c, int d){
		System.out.println(a+b+c+d);
	}
	
	public void sum(int a, int b, String c){
		System.out.println(c+" "+a+b);
	}

	public void sum(String c, int a, int b){
		System.out.println(c+" "+a+b);
	}


	public void sum(int a, int b, boolean d) {
		// TODO Auto-generated method stub
		
	}

}
