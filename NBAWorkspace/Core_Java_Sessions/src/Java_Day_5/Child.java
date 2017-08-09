package Java_Day_5;

public class Child extends Parent{
	
	int a;
	int b;
	

	public static void main(String[] args) {
		Child obj = new Child();
		obj.sum();
		obj.SuperClassMethods();
		
		
	}

	public void sum(int a, int b){
		System.out.println(a+b);
		
	}
	
	
	public void SuperClassMethods(){
		a = 10;
		super.b = 20;
		this.a= 10;
		this.b = 90;
		super.sum();
		
	}
}
