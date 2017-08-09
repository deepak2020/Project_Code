package testPackage;

public class Loop {

	public static void main(String[] args) {
		Loop obj = new Loop();
		//obj.checkCondition(100);	
//		obj.whileCondition(50,51);
//		obj.doWhileCondition(100);
//		obj.star();
		obj.breakLoop();
		
	}
	
	public void checkCondition(int number){
		
		for (int n =number; n>=0; n--){
		 if (n%2==0){
		  System.out.println("Even number is "+ n);
		 } else System.out.println("Odd number is "+ n);
		  
		}
	}
	
	
public void whileCondition(int number1, int number2){
	
		int n=number1;
		int m=number2;
		
		while (n>=0){
		 if (n%2==0){
		  System.out.println("Even number is before 50 ----->>"+ n);
		 } else System.out.println("Odd number is before 50 ----->>"+ n);
		  n--;
		}
		
		while (m<=100){
			 if (m%2==0){
			  System.out.println("Even number is after 50 -----> "+ m);
			 } else System.out.println("Odd number is  after 50----->"+ m);
			 m++;
			}
	}

public void doWhileCondition(int number){
	
	int n=0;
	
	do{
		if (n%2==0){
			  System.out.println("Even number is "+ n);
			 } else System.out.println("Odd number is "+ n);
		n++;
	}		
	while (n<=number);

}

public void star(){
	for (int i= 0; i<=100; i++){
		System.out.println("*"); 
		for (int n=0; n<i; n++){
		System.out.print("*");
	}
	}
}

public void breakLoop(){
	for (int n=0; n<=100; n++){
		if (n==50){
			System.out.println("Got the number 50");
			break;
		}
		System.out.println("Number is....> "+ n);
		 continue;
	
	}
}


}
