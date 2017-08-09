package testPackage;

public class Methods {

	public static void main(String[] args) {
		
		Methods obj = new Methods();
		
		obj.sum(10, 20, 30);
		obj.sum(10, "This is another Sum");
		obj.sum("Oye ", 10);
		obj.sum(10, 50);
	}
	public  void sum(int a, int b){
		int sum = a+b;
		System.out.println(sum);
	}
	public void sum(int a, int b, int c){
		int sum = a+b+c;
		System.out.println(sum);
	}
	
	public void sum(int a, String b){
		Object sum = a + b;
		System.out.println(sum);
	}
	
	public void sum(String b, int a){
		Object sum = a + b;
		System.out.println(sum);
	}

}
