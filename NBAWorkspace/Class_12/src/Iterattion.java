public class Iterattion extends Session_4 implements interface_Session, interface_Session2 {
	
	 Iterattion(String a) {
		System.out.println(" I am constructor" + a);
	}
	 
	 Iterattion(String a, String b) {
			System.out.println(" I am constructor" + a + b);
		}
	static final int a =0;
	int b;
	public static void main(String arg[]){
		System.out.println(a);
		Iterattion obj1 = new Iterattion("1");
		Iterattion obj2 = new Iterattion("2", "3");
		staticPrint();
		obj1.changeValue();
		obj1.print();
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		obj2.print();
		
		
	}
	
	public void print(){
		System.out.println("Value of a " + a);
		System.out.println("Value of b " + b);
	}

	public static void staticPrint(){
	
		System.out.println("Value of a changed by static "+ a);
	}
	
	public void changeValue(){
		b=20;
		System.out.println("Value of b changed by "+ b);
	}

	@Override
	public void sum() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sum2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sum3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sum4() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sum5() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sum6() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sum7() {
		// TODO Auto-generated method stub
		
	}
}
