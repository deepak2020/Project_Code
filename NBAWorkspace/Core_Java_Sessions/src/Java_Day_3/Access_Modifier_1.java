package Java_Day_3;

public class Access_Modifier_1 extends Access_Modifier_Public{

	public void sum(int a, int b) {
		System.out.println(a-b);
	}

	public static void main(String[] args) {
	Access_Modifier_Public obj = new Access_Modifier_Public();
	obj.sum(10, 20);

	Access_Modifier_1 obj1= new Access_Modifier_1();
	obj1.sum(10, 50);
	}

}
