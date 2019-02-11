package ver1;

public class CurrentAccount extends Account {

	public CurrentAccount(Customer arg1, double arg2) {
		super(arg1, arg2);
	}
	
	public Customer getCustomer() {
		
		return theCustomer;
	}
	
	public void payIn(double arg) {
		theBalance = theBalance + arg;
	}
	
}
