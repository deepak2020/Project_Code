package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;



public class Collections_API {

	public static void main(String[] args) {
		
	//Array List
		
//		ArrayList<Integer> al = new ArrayList<Integer>();
//		LinkedList<Integer> al = new LinkedList<Integer>();
		TreeSet<Integer> al = new TreeSet();
		al.add(2);
		al.add(1);
		al.add(1);
		al.add(2);
		al.add(1);
		al.add(2);
		al.add(1);
		al.add(2);
		al.add(1);
		al.add(2);
		al.add(1);
		al.add(2);
		al.add(null);
		al.add(100);
		
		al.remove(5);
		
//		al.addFirst(1000);
		
		
//		for (int i = 0; i<al.size(); i++){
//			System.out.println(al.get(i));
		
		Iterator itr = al.iterator();
		while (itr.hasNext()){
			System.out.println(itr.next());
		}
			
//		}
	}

}
