package staticConcept;

public class StaticDemo {
	
	String name;
	String address;
	static String city = "Kovai";
	static int i=0;
	int j=0;
	
	public StaticDemo(String name, String address) {
		
		this.name = name;
		this.address = address;
		this.city = city;
		i++;
		j++;
		System.out.println(i);
		System.out.println(j);
		
	}
	
	public static void getCity() {
		System.out.println(city);
	}
	
	public void getAddress() {
		System.out.println(address + " " + city);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticDemo obj = new StaticDemo("San","NKP");
		StaticDemo obj1 = new StaticDemo("Ram","PKP");
		
		obj.getAddress();
		obj1.getAddress();
		StaticDemo.getCity();
		StaticDemo.i=4;
		

	}

}
