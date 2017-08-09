package daytwo;

public class method_overloading extends Contructo_practice {
	
	@Override
	public void sum1() {
		// TODO Auto-generated method stub
		super.sum1();
	}
	
	
	

	public static void main(String[] args) {

	}
	
	public void sum(){
		System.out.println("no paramter passed");
		int a=10; 
		int b=90;
		int result = a+b;
		System.out.println(result);
	}

	public void sum(int a, int b) {
		System.out.println(a+b);

	}

	public void sum(int a, int b, int c) {
		System.out.println(a+b+c);

	}
	
	public void sum(int a, String b) {
		System.out.println(a+b);

	}

	public void sum(String a, int b) {
		System.out.println(a+b);

	}
	
	
}
