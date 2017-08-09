import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map_Session {

	public static void main(String[] args) {
//  * 
		LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();
		hm.put(1, "Deepak");
		hm.put(2, "Neha");
		hm.put(2, "Pooja");
		hm.put(2, "Pooja1");
		hm.put(3, "Ravi");
		
		

	
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
			System.out.println();
		}
	}

}
