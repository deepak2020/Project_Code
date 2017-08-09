import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedList {

	public static void main(String[] args) {

		// java.util.LinkedList<Integer> al = new
		// java.util.LinkedList<Integer>();
//		HashSet<Integer> al = new HashSet<Integer>();
//		LinkedHashSet<Integer> al = new LinkedHashSet<Integer>(); 
		TreeSet<String> al = new TreeSet<String>();
//		al.add(90);
//		al.add(20);
//		al.add(60);
//		al.add(40);
//		al.add(10);
//		al.add(20);
//		al.add(30);
//		al.add(40);
//		al.add(10);
//		al.add(20);
//		al.add(30);
		al.add("Ravi");
		al.add("Deepak");

		Iterator<String> itr = al.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}

	}

}
