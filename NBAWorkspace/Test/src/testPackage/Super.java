package testPackage;

public class Super extends methodOverriding1 {
	
	int a= 100;
	
	public static void main(String[] args) {
	Super obj = new Super();
	obj.superprint();
	
	
	}
	
	public void superprint(){
		System.out.println("I am super obj"+ super.a);
		System.out.println("I am local obj"+ a);
	
	}

}
