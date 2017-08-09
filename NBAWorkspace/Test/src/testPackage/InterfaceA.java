package testPackage;

import java.awt.print.Printable;

public class InterfaceA implements Inheritance {

	public static void main(String[] args) {
		InterfaceA obj = new InterfaceA();
		obj.sum();
		obj.multiply();
		obj.print();
		
	}

	@Override
	public void print() {
		System.out.println("This is print");
		
	}

	@Override
	public void sum() {
		System.out.println("This is sum");
		
	}

	@Override
	public void multiply() {
		System.out.println("This is multiply");
		
	}

}
