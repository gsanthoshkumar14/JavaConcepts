package encapsulation;

public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank obj = new Bank();
		obj.withDrawAmt(123456, 1234, 10000);
		obj.updatePin(123456, 1234, 5555);
		obj.withDrawAmt(123456, 1234, 10000);

	}

}
