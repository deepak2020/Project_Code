import java.util.HashMap;
import java.util.Map;


public class Maps {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Deepak");
		hm.put(2, "Ravi");
		hm.put(2, "Ravina");
		hm.put(null, "Rambo");
		hm.put(null, "Rambo1");
		
		hm.remove(null);
//		for(int i=1; i<=2; i++){
//			System.out.println(hm.get(i));
//		}
		
		for (Map.Entry m:hm.entrySet()){
			System.out.println((m.getKey()+ " "+ m.getValue()));
		}
		

	}

}