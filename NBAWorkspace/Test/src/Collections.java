import java.util.ArrayList;
import java.util.Iterator;

public class Collections {

	public static void main(String arg[]) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
//		System.out.println(al.size());
//		System.out.println(al.get(2));
		
//		for (int i=0; i<=al.size(); i++){
//			try {
//			System.out.println(al.get(i));
//			}catch (Exception e){
//				System.out.println(e.getMessage());
//			}
//		}

		Iterator itr = al.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
