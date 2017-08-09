package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Collection_day2 {

	public static void main(String[] args) {
//		HashMap<Integer, String> hm = new HashMap<Integer, String>();
//		LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();
		TreeMap<Integer, String> hm = new TreeMap<Integer, String>();
		hm.put(3, null);
		hm.put(1, null);
		hm.put(2, "abrar");
//		hm.put(null, "shama");
//		hm.put(null, "rana");

		for (Map.Entry m:hm.entrySet()){
			System.out.println(m.getKey() + " "+ m.getValue());
		}
	}

}
