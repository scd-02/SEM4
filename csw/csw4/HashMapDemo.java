import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<>();
		//Insertion
		hm.put(12, "Aryan");
		hm.put(2, "Aunshka");
		hm.put(13, "Sushil");
		hm.put(33, "Anurag");
		hm.put(43, "Sourav");
		
		System.out.println(hm);
		
		//Searching
		System.out.println(hm.containsKey(33));
		System.out.println(hm.containsValue("Sushil"));
		
		System.out.println(hm.get(2));
		System.out.println(hm.get(15));
		
		System.out.println(hm.getOrDefault(22,"Not Available"));
		
		//Iteration
		for(Map.Entry<Integer, String> e: hm.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue());
			
		}
		System.out.println();
		Set<Integer> keys = hm.keySet();
		for(Integer key:keys) {
			System.out.println(key+" "+hm.get(key));
		}
		
		//Deletion
		System.out.println(hm.remove(33));
		System.out.println(hm);

	}

}
