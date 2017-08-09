package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Collection_day_1 {

	public static void main(String[] args) {
//		ArrayList<Integer> li = new ArrayList<Integer>();
//		LinkedList<Integer> li = new LinkedList<Integer>();
//		HashSet<Integer> li = new HashSet<Integer>();
//		LinkedHashSet<Integer> li = new LinkedHashSet<Integer>();
		TreeSet<Integer> li = new TreeSet<Integer>();
		li.add(3);
		li.add(1);
//		li.add(2);
//		li.add(3);
//		li.add(1);
//		li.add(2);
//		li.add(1);
//
//		li.add(1);
//		li.add(2);
//		li.add(1);
//
//		li.add(1);
//		li.add(2);
//		li.add(1);
//		
//		li.remove(10);

//		System.out.println(li.get(1));
		System.out.println(li.size());
		
		Iterator itr = li.iterator();
		while (itr.hasNext()){
			System.out.println(itr.next());
		}

	}

}
