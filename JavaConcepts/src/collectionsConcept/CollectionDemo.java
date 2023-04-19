package collectionsConcept;

import java.util.ArrayList;
import java.util.HashMap;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {4,5,7,5,6,4,6,7,5,5,7,4,9};
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
		
		for(int i=0;i<a.length;i++) {
			int k=0;
			if(!al.contains(a[i])) {
				al.add(a[i]);
				k++;
				for(int j=i+1;j<a.length;j++) {
					if(a[i] == a[j]) {
						k++;
					}
				}
				m.put(a[i], k);
				System.out.println(a[i] + " " + k);
				if(k==1) {
					System.out.println(a[i]);
				}
			}
			
		}
		
		System.out.println(m);
		
	}

}
