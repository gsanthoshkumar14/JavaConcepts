
public class Account {
	
	private String number;
	private String customerName;
	private String emailId;
	private String phoneNumber;
	private double balance;
	
	public Account() {
		System.out.println("Default constructor");
	}
	
	public Account(String number, String customerName, String emailId, String phoneNumber, double balance) {
		super();
		this.number = number;
		this.customerName = customerName;
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
		this.balance = balance;
	}
	public void deposit(double depositAmount) {
		this.balance += depositAmount;
		System.out.println("Available balance after deposit is :"+this.balance);
	}
	public void withDrawal(double withDrawalAmount) {
		if(this.balance - withDrawalAmount <0) {
			System.out.println("Insufficient balance :" + this.balance + ". So requested withdrawal of "+ withDrawalAmount+ " cannot be processed");
		} 
		else {
		this.balance -= withDrawalAmount;
		System.out.println("Available balance after withdrawal is :"+this.balance);
		}
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	

}
