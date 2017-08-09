package dayOne;

public class Class_Object {
	
	int age;
	String name;
	static String school;

	public static void main(String[] args) {
		Class_Object deepak = new Class_Object();
		deepak.age=29;
		deepak.name="Deeak Kumar Rana";
		deepak.schoolName();
		deepak.characterstic();
		deepak.eat();
		deepak.run();
		
		System.out.println(deepak.sum(10, 20));
		
		System.out.println("*********************");
		
		Class_Object ravi = new Class_Object();
//		ravi.age=17;
//		ravi.name="Ravi Kumar Rana";
		ravi.characterstic();
		ravi.eat();
		ravi.run();
		System.out.println(ravi.sum(30, 50));
		

	}
	
	public void eat(){
		System.out.println("I can eat");
	
	
	}
	
	public void run(){
		System.out.println("I can run");
	}
	
	public void characterstic(){
		System.out.println("Age is "+ age);
		System.out.println("Name is "+ name);
		System.out.println(school);
	}
	
	public Integer sum (int a, int b){
		int sum = a+b;
		return sum;
	}

	public void schoolName(){
		school = "ArmySchool";
	}
}
