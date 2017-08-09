package dayOne;

 class Access_Modifier {

	final static int a=100;

	public void sum() {
		System.out.println("I am public method");
	}

	private void sum1() {
		System.out.println("I am private method");
	}

	void sum2() {
		
		System.out.println("I am deafult method");
	}

	protected void sum3() {
		System.out.println("I am protected method");
	}

}
