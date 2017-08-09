package Java_Day_1;

public class Methods extends Access_Modifier {

	public static void main(String[] args) {

		Methods obj = new Methods();
		obj.sum();
		obj.sum_java_package_day1(a, b);
		System.out.println(obj.sum(90, 20));
		Access_Modifier obj1 = new Access_Modifier();
		obj1.sum_java_package_day1(10, 20);
	}
		

	public void sum() { // /no pramaterised
		int a = 10;

		int b = 20;

		int sum = a + b;

		System.out.println(sum);
	}

	public int sum(int a, int b) { // parameterized 
		int sum = a + b;
		return sum;
		
	}

}
