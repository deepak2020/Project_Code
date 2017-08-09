package session1;

public class InterfacePractice implements Interface,Interface2 {

	public static void main(String[] args) {
		InterfacePractice obj = new InterfacePractice();
		obj.sum();
		obj.subtract();
		
	}

	@Override
	public void sum() {
		System.out.println("I am sum");
	}

	@Override
	public void subtract() {
		System.out.println("I am subtract");
		
	}

	@Override
	public void sum1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void subtract1() {
		// TODO Auto-generated method stub
		
	}

}
