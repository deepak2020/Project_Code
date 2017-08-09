package java_Day_6;

public class This_Super extends Constructor {
	int a;
	int b;

	public static void main(String[] args) {
		This_Super obj = new This_Super();
//		obj.sumChildClass();
		obj.sumParentClass();
		

	}
	
	public void sumChildClass(){
		
		System.out.println("Child class sum"+ " "+(a+b));
	}

	public void sumParentClass(){
		super.a = 10;
		super.b = 20;
		this.a=100;
		this.b=200;
		this.sumChildClass();
		super.sum();
		}
}
