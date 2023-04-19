
public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Rain and thunderstorm started here";
		
		System.out.println(str.length());
		
		System.out.println(str.charAt(5));
		
		System.out.println(str.indexOf('s'));
		
		System.out.println(str.indexOf('s', str.indexOf('s')+1));
		
		System.out.println(str.indexOf("here"));

	}

}
