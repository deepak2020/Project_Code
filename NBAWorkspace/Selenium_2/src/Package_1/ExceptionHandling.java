package Package_1;

public class ExceptionHandling {

	public static void main(String[] args) {
		int a = 2;
		int b = 10;
		try {
			int divide = b / a;
//		} catch (ArithmeticException e) {
//			System.out.println(e.getMessage());
//		}catch (OutOfMemoryError e) {
//			System.out.println(e.getMessage());
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println(e.getMessage());
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
		}finally{
			System.out.println("I am here to close all rtesoyrcse");
		}
		

		System.out.println("I am executed");

	}

}
