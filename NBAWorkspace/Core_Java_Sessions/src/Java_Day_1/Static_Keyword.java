package Java_Day_1;

public class Static_Keyword {
	
	String name;
	int rollNo;
	String school;

	public static void main(String[] args) {
		
		Static_Keyword student1 = new Static_Keyword();
		Static_Keyword student2 = new Static_Keyword();
		Static_Keyword student3 = new Static_Keyword();
		Static_Keyword student4 = new Static_Keyword();
		
		student1.studentDetails("ravi", 1);
		student2.studentDetails("deepak", 2);
		student3.studentDetails("shaym", 3);
		student4.studentDetails("monu", 4);
		
		
		
	

	}
	
	public void studentDetails(String studentName, int studentRollNo){
		
		name = studentName;
		rollNo = studentRollNo;
		
		System.out.println(name+" " +rollNo+ " "+school);
	}
	
	
	
}
