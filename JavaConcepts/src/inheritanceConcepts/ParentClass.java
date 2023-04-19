package inheritanceConcepts;

public class ParentClass {
	
	public ParentClass() {
		System.out.println("parent constructor");
	}
	
	public String colour = "red";
	
	public String name = "parent";

	
	public void engine() {
		System.out.println("engine implementation");
	}
	
	public void gear() {
		System.out.println("gear implemented");
	}
	
	public void brakes() {
		System.out.println("brakes implemented");
	}
	
	public void getData() {
		System.out.println("parent method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
