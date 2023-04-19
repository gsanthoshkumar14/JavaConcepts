package collectionsConcept;

import java.util.HashSet;
import java.util.Iterator;

public class SetConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hs = new HashSet<String>();
		
		hs.add("INDIA");
		hs.add("RUSSIA");
		hs.add("UK");
		hs.add("USA");
		hs.add("FRANCE");
		System.out.println(hs);
		System.out.println(hs.contains("UK"));
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		
		Iterator<String> it = hs.iterator();
		System.out.println(it.next());
		Iterator<String> it1 = hs.iterator();
		System.out.println("****************************************");
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		System.out.println("****************************************");
		
		for(String s : hs) {
			System.out.println(s);
		}
	}

}
