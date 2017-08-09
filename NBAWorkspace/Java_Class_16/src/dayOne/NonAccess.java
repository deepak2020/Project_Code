package dayOne;

final public class NonAccess {

	public static void main(String[] args) {
		sum();
		
		NonAccess obj = new NonAccess();
		obj.sum1();
	}
	
	public static void sum (){
		System.out.println("I am satic sum");
	}

	final public void sum1 (){
		System.out.println("I am nonsatic sum");
	}
	
	
	public void ObjectSum(){
		sum();
		sum1();
	}
}
