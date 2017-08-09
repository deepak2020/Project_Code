package Java_Day_3;

public class Access_Modifier_Public {
	
	final int d = 0;

	public static void main(String[] args) {
		
		Access_Modifier_Public obj = new Access_Modifier_Public();
//		obj.sum();
	}
	
	
	 public final void sum (int a, int b){
		
		System.out.println(a+b);
	}

}
