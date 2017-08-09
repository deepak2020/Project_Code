package Package_1;

public class Method_Overriding extends Method_Overloading {
	
	static int d;
	
	@Override
	public void sum(int a, int b) {
		int subtract = a-b;
		System.out.println(subtract);
		
	}

	public static void main(String[] args) {
		Method_Overriding obj =new Method_Overriding();
		obj.sum(30, 20);
		obj.sum1(100);
		System.out.println("value of d is"+ d);
		
		

	}
	
	public  void sum1(int d){
		this.d=d;
	}

}
