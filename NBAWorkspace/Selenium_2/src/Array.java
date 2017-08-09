
public class Array {
	int a; //instance Variable

	

	public static void main(String[] args) {
				 int a; //locale variable
//		int marks[][] = {{10,20,30}, {40,50,60}};
//		System.out.println(" This is lenghth "+ marks.length);
//		for (int i =0; i<marks.length; i++){
//			for(int n=0; n<=marks.length; n++){
//			System.out.print(marks[i][n] + " ");
//			}
//			System.out.println();
//		}
		
		Array obj = new Array();
		obj.sum();
		obj.a=10;

	}
	
	public void sum(){
		a=20;
		System.out.println("Hey I am sum");
	}

}
