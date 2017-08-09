package Package_1;

public class Method_Overloading {

	public static void main(String[] args) {
		
		Method_Overloading obj = new Method_Overloading();
		obj.sum(10,20, 30);
		obj.sum("SUm is ", 30, 50);

	}
	
	public void sum(int a, int b){
		int sum = a+b;
		System.out.println(sum);
	}
	
	public void sum(int a, int b, int c){
		int sum = a+b+c;
		System.out.println(sum);
	}
	
	public void sum(String  a, int b, int c){
		int sum = c+b;
	
		System.out.println(a+sum);
	}
	
	public void sum(int b, int c, String  a){
		int sum = c+b;
		
		System.out.println(a+sum);
	}

}
