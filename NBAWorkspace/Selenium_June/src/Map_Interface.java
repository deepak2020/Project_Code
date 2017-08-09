import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


public class Map_Interface {

	public static void main(String[] args) {
		TreeMap<String, String> hm = new TreeMap<String, String>();
		hm.put("99", "Deepak");
		hm.put("2", null);
		hm.put("a", null);
		hm.put("b", "Sham");
		hm.put("c", "Ankit");
//		hm.put(null, "Shyam");
//		hm.put(null, "Tom");
		hm.put("e", "Sham");
		
	
		

		
		for (Map.Entry m: hm.entrySet()){
			System.out.println(m.getKey() + " "+ m.getValue());
		}

	}

}
