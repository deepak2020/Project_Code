package testPackage;

public class Instance {
	int sum;
	int Subtract;

	public static void main(String[] args) {
		Instance obj1 = new Instance();
		obj1.sum(20, 50);
		obj1.printSum();
		
		Instance obj2 = new Instance();
		obj2.sum(50, 50);
		obj2.printSum();
		
		obj2.subtractFromSum(10);
		obj2.printSubtract();

	}
	
	public void sum (int a, int b){
		sum = a+ b;
	}
	
	public void printSum(){
	System.out.println("Sum of the numbe is "+ sum);	
	}
	
	public void subtractFromSum(int b){
		
		Subtract = sum - b;
		
	}
	
	public void printSubtract(){
		System.out.println("Subracttion is"+ Subtract );
	}

}
