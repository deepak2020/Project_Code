package java_basics;

public class Break_Continue {

	public static void main(String[] args) {
	
		Break_Continue obj = new Break_Continue();
		int c = obj.sum(10, 20);
		System.out.println(c);
		int d = add(30, 60);
		System.out.println(d);
		

	}
	
	
	public  Integer sum (int a, int b){
		int sum  = a+b;
		return sum;
	}

	public  static Integer add (int a, int b){
		int sum  = a+b;
		return sum;
	}
}