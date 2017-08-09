import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;


public class Collections_Session implements interface_Session {

	public static void main(String[] args) {
		
		Collections_Session obj1 = new Collections_Session();
		
		interface_Session obj = obj1.employeeID();
		
		LinkedList<Integer> al = new LinkedList();
		al.add(1);
		al.add(10);
		al.add(11);
		al.add(50);
		al.add(95);
		al.add(97);
		al.add(1);
		al.add(10);
		al.add(11);
		al.add(50);
		al.add(95);
		al.add(97);
		
		al.remove(10);
//		al.add("Deepak");
//		al.add("Deepak 1");
//		al.add("Deepak 9");
//		al.add("Deepak 6");
//		al.add("Deepak 100");
//		al.add("Deepak 50");
		
		
//		for (int i =0; i<=7; i++){
//		System.out.println(al.get(i));
//		}
		
		Iterator it = al.iterator();
		
		
		while (it.hasNext()){
			System.out.println(it.next());
		}
	}

	@Override
	public interface_Session employeeID() {
		return null;
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void name() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void designation() {
		// TODO Auto-generated method stub
		
	}

}
