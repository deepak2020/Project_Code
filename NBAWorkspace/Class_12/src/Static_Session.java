
public class Static_Session {
	
	static String school = " Army Public School ";

	public static void main(String[] args) {
		Static_Session obj = new Static_Session();
		obj.student1();
		obj.student2();
		obj.student3();
		
	}
	
	public static void student1(){
		int rollno =1;
		String name = " Deepak ";
		System.out.println(rollno + name +school);
	}
	
	public static void student2(){
		int rollno =2;
		String name = " Ravi ";
		school = "donbosco school";
		System.out.println(rollno + name +school);
	}
	
	public static void student3(){
		int rollno =3;
		String name = " Rana ";
		System.out.println(rollno + name +school);
	}


}
