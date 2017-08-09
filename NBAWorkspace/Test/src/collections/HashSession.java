package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSession {

	public static void main(String[] args) {
		
		TreeSet<String> al = new TreeSet<String>();
		al.add("Deepak");
		al.add("Ravi");
		al.add("Vishal");
		al.add("Sayali");
		al.add("Gaurav");
		al.add("Pratim");
		al.add("Pratim");
		al.add("Pratim");
		al.add("Apple");
		
//		System.out.println(al);
		
		Iterator itr = al.iterator();
		
		while (itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
