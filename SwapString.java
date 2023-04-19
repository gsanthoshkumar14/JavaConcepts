
public class SwapString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "hello";
		String b = "world";
		
		// append a and b
		
		a = a+b;
		
		b = a.substring(0,a.length()-b.length());
		
		a = a.substring(b.length());
		
		System.out.println(a);
		System.out.println(b);

	}

}
