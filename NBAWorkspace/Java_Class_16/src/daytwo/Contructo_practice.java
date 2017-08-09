package daytwo;

public class Contructo_practice {

	int a;
	int b;

	public Contructo_practice(int a, int b) {

		this.a = a;
		this.b = b;

	}

	public Contructo_practice() {

	}

	public static void main(String[] args) {

		Contructo_practice obj = new Contructo_practice(10, 20);
		obj.sum1();

		Contructo_practice obj1 = new Contructo_practice();
		obj1.sum1();

	}

	public void sum1() {
		System.out.println(a + b);
	}

}
