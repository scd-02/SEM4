import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet <Integer> hs = new HashSet<>();
		//Insertion
		hs.add(1);
		hs.add(2);
		hs.add(1);
		hs.add(55);
		hs.add(11);
		hs.add(32);
		hs.add(65);
		hs.add(51);
		System.out.println(hs.size());
		System.out.println(hs);
		
		//Deletion
		hs.remove(65);
		hs.remove(52);
		
		System.out.println(hs.size());
		System.out.println(hs);
		
		//Traversal
		Iterator<Integer> it =hs.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		
		//Searching
		System.out.println("\n"+hs.contains(5));
		System.out.println(hs.contains(54));

		
	}

}
