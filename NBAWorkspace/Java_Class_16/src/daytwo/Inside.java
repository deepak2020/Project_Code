package daytwo;

public class Inside extends method_overloading {

	
	public void sum(float a, int b) {
		System.out.println(a-b);
	}
	public static void main(String arg[]) {
		
		Inside obj = new Inside();
		obj.sum(10.01f, 20);
		obj.sum(10,"Deepak");
		obj.sum();

	}
}
