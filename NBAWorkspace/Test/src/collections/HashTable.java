package collections;

import java.util.Hashtable;
import java.util.Map;

public class HashTable {

	public static void main(String[] args) {
		Hashtable<Integer, String> hm = new Hashtable<Integer, String>();
		hm.put(100, "Gaurav");
		hm.put(101, "Sayali");
		hm.put(102, "Sayali");
		
		for(Map.Entry m:hm.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
			   
			  }  

	}

}