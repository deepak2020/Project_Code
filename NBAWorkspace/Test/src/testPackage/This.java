package testPackage;

public class This {
	 int a;
	 String  b;
	
	 This(){
		 System.out.println("WHo the hell is calling me");
	 }
	 
	 This(int a){
		 this();
		 System.out.println(a);
	 }
	 
	public static void main(String[] args) {
	This obj = new This();
	obj.sum(10, "       This is number");
	obj.print();
	
	

	}
	
	
	public void sum(int num, String str){
		a = num;
		b = str;
	}
	
	public void print(){
		System.out.println(a + b);
	}

}
