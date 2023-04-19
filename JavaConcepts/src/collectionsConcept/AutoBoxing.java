package collectionsConcept;

public class AutoBoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int var = 10;
		Integer obj = new Integer(var);//wrapping ->autoboxing
		
		System.out.println(obj);
		int i = obj;//unwrapping ->autounboxing
	}

}
