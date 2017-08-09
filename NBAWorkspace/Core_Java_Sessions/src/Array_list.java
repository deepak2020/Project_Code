public class Array_list {

	public static void main(String[] args) {
		int [][] a = new int [2][3];
		a[0][0] = 1;
		a[0][1] = 10;
		a[0][2] = 10;
		a[1][0] = 1;
		a[1][1] = 10;
		a[1][2] = 10;
		
		
		for (int i = 0; i< 2; i++){
			for (int j =0; j<3; j++){
				System.out.print(a[i][j] + " ");
		
		}
			System.out.println();
		}

	}
}
