
public class Overloading {
	
	int amount = 100;

	public static void main(String[] args) {
		
		Overloading obj = new Overloading();
		obj.sum(10, 20);
//		obj.sum(10, 20, 30);
//		obj.sum("The sume of   ", 20, 70);
//		obj.sum( 20, 70, "   The sume of ");
	}
	
	public void sum (int a, int b){
		System.out.println(a+b);
	}
	
	public void sum1 (int a, int b, int c){
		System.out.println(a+b+c);
	}
	
	public void sum2 (String a, int b, int c){
		System.out.println(a+(b+c));
	}
	
	public void sum3 ( int b, int c, String a){
		System.out.println((b+c)+ a);
	}
}
