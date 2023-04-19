package collectionsConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a = new ArrayList<String>();
		ArrayList list = new ArrayList();
		a.add("Santhosh");
		a.add("Sorna");
		System.out.println(a);
		a.add(0, "Vaibhav");
		System.out.println(a);
		a.remove(0);
		System.out.println(a);
		System.out.println(a.get(0));
		System.out.println(a.contains("Sorna"));
		System.out.println(a.indexOf("Sorna"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		
		list.add(10);
		list.add("San");
		list.add(10.55);
		list.add('e');
		list.add(true);
		list.add(null);
		System.out.println(list);
		
		for(Object o:list) {
			System.out.println(o);
		}
		
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
