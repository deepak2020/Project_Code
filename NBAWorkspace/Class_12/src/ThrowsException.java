
public class ThrowsException extends Exception_Hanlding{

	public static void main(String[] args) {
		
		ThrowsException obj = new ThrowsException();
		try {
		System.out.println(obj.division(10, 0));
		} finally {
			System.out.println("Hello I am finally");
		}

	}
  
}
