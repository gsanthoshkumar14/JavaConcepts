package encapsulation;

public class Bank {

	public final int accounto = 123456;
	private int pinNo = 1234;
	private double balanceAmt = 1000000;
	

	public double getBalanceAmt() {
		return balanceAmt;
	}

	public int getAccounto() {
		return accounto;
	}

	public void withDrawAmt(int accNo, int pin, double amt) {
		
		if(accNo==accounto && pin==pinNo) {
			if(amt<=balanceAmt) {
				balanceAmt = balanceAmt-amt;
				System.out.println("Amount withdrawal :"+amt);
			}
			else {
				System.out.println("Insufficient Balance !!!");
			}
		}
		else {
			System.out.println("Invalid credentials !!!");
		}
	}
	
	public void depositAmt(int accNo, double amt) {
		if(accNo==accounto) {
			balanceAmt = balanceAmt+amt;
			System.out.println("Amount Deposited :"+amt);
		}
	}
	
	public void updatePin(int accNo, int oldPin, int newPin) {
		if(accNo==accounto && oldPin==pinNo) {
			pinNo = newPin;
			System.out.println("Pin successfully updated");
		}
		else {
			System.out.println("Invalid credentials !!!");
		}
	}

		
	
}
