package Calculator;

public class Calculator {
	
	public Integer sum(int a, int b){
		int sum = a+b;
		return sum;
	}
	
	public Integer subtract(int a, int b){
		int subtract = a-b;
		return subtract;
	}

	public Integer multiply(int a, int b){
		int multiply = a*b;
		return multiply;
	}
	
	public Integer division(int a, int b){
		int division = a/b;
		return division;
	}
	
	public int Calc(int a, String s, int b){
		int value=0;
		if (s.equals("+")){
			value = a+b;	
		}
		if (s.equals("-")){
			value = a-b;	
		}
		if (s.equals("*")){
			value = a*b;	
		}
		if (s.equals("/")){
			value = a/b;	
		}
		return value;
		
	}
}
