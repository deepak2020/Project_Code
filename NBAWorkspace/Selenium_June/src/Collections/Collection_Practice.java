package Collections;

import java.util.Iterator;
import java.util.TreeSet;

public class Collection_Practice {

	public static void main(String[] args) {
//		ArrayList<Integer> al = new ArrayList<Integer>();
		
//		LinkedList<Integer> al = new LinkedList<Integer>();
//		HashSet<Integer> al = new HashSet<Integer>();
		TreeSet<Integer> al = new TreeSet<Integer>();
		
		al.add(99);
		al.add(99);
		al.add(99);
		al.add(10);
		al.add(11);
		al.add(13);
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		
	

		// System.out.println(al.get(5));

		Iterator<Integer> it = al.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
