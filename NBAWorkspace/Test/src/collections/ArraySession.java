package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArraySession {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(1);
		al.add(2);
		al.add(3);
		
		
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(1);
		al.add(2);
		al.add(3);
		
		al.remove(5);
		int size = al.size();
//		for (int i =0; i<size; i++)
//		System.out.println(al.get(i));
		
		Iterator itr = al.iterator();
		ListIterator litr = al.listIterator();
//		while(itr.hasNext()){
//			System.out.println("**********************"+ itr.next());	
//		}
//		
		while (litr.hasNext()){
			System.out.println("######################" + litr.next());
		}
		
		while (litr.hasPrevious()){
			System.out.println("11111111111111----->>>" + litr.previous());
		}
			
	}

}
