package accessPackage;

import testPackage.AccessClass;
import testPackage.AccessModifier;
import testPackage.TestClass;

public class AccessClass1 extends testPackage.AccessModifier {

	public static void main(String[] args) {
		AccessClass1 test = new AccessClass1();
		test.subtract(10, 5);
		
		Session1 obj = new Session1();
		obj.sum(25, 25);
		obj.multiply(10, 20);
		
		AccessClass1 obj3 = new AccessClass1();
		obj3.sum();
		
		AccessModifier obj1 = new AccessModifier();
		obj1.sum();
	}

}
