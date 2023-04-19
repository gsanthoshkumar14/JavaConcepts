package collectionsConcept;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Diff between hashmap and hash table
		// hashmap is not synchronized and not thread safe whereas hash table is synchronized and thread safe
		// hashmap allows null keys and null values and hash table not allows null values and null keys
		// hashmap can be iterate through iterator whereas hash table needs enumerator to iterate
		// remaining all are same in hashmap and hashtable
		
		HashMap<Integer, String> mp = new HashMap<Integer, String>();
		
		mp.put(0, "Hello");
		mp.put(1, "Bye");
		mp.put(2, "morning");
		mp.put(3, "evening");
		System.out.println(mp.get(2));
		System.out.println(mp.get(5));
		System.out.println(mp.isEmpty());
		Set s = mp.entrySet();
		System.out.println(s);
		
		Iterator it = s.iterator();
		
		while(it.hasNext()) {
			Map.Entry abc = (Map.Entry)it.next();
			System.out.println(abc.getValue());
			System.out.println(abc.getKey());
		}
		
		System.out.println("*************************************************");
		
		Set<Integer> keys = mp.keySet();
		for(Integer key: keys ) {
			System.out.println("Key ----->"+key+" Value ----->"+mp.get(key));
		}
		
		System.out.println("*************************************************");
		
		Map<String,List<String>> abc = new HashMap<String,List<String>>();
		List<String> listOfEmail = new ArrayList<String>();
		listOfEmail.add("abc@123.com");
		listOfEmail.add("def@123.com");
		listOfEmail.add("ghi@123.com");
		listOfEmail.add("jkl@123.com");
		listOfEmail.add("mno@123.com");
		
		abc.put("email", listOfEmail);
		
		System.out.println(abc);

	}

}
