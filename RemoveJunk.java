
public class RemoveJunk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "$*(*^&*%%String6870097Java**()*(%";
		
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);

	}

}
