package Java_batch_6;

public class Continue {

	public static void main(String[] args) {
		for (int i=0; i<5; i++){
			if (i==2){
				continue;
			}
			System.out.println("Number is "+ i);
		}

	}

}