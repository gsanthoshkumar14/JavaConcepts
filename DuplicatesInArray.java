import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] a = {"java","cucumber","selenium","restassured","maven","testng","cucumber","maven"};
		
		
		//1.Normal
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i].equals(a[j])) {
					System.out.println(a[i]);
				}
			}
		}
		
		
		//2.HashSet
		Set<String> hashSet = new HashSet<String>();
		
		for(String name : a) {
			if(!hashSet.contains(name)) {
				hashSet.add(name);
			}
			
			else {
				System.out.println(name);
			}
		}
		
		//3.HashMap
		Map<String,Integer> hm = new HashMap<String,Integer>();
		
		
		for(String name : a) {
			Integer count =hm.get(name);
			if(count == null) {
				hm.put(name, 1);
			}
			else {
				//System.out.println(name);
				hm.put(name, ++count);
			}
		}
		
		Set<Entry<String,Integer>> entrySet = hm.entrySet();
		for(Entry<String,Integer> entry : entrySet) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey());
			}
		}
		
		
		

	}

}
