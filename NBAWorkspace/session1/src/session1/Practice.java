package session1;

public class Practice extends Abstraction {

	public static void main(String[] args) {
		Practice obj = new Practice();
		obj.sum();
		obj.sum(10, 20);
		
		Practice deepak = new Practice();
		deepak.sum();
	}

	@Override
	public void sum() {
		System.out.println("Hi all");
		
	}

}
