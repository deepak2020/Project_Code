package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class ArrayList_Obj {

	public static void main(String[] args) {
	
//		ArrayList<Integer> li = new ArrayList<Integer>();
		
//		LinkedList<Integer> li = new LinkedList<Integer>();
		
		TreeSet<Integer> li = new TreeSet<Integer>();
		li.add(99);
		li.add(2);
		li.add(3);
		li.add(4);
		li.add(5);
		li.add(6);
		li.add(4);
		li.add(5);
		li.add(6);
		li.add(77);
		

		
//		System.out.println((li.size()));
		
		Iterator it = li.iterator();
		
		while (it.hasNext()){
			System.out.println(it.next());
		}
	}

}
