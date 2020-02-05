
public class Customer {
	String name;
	Bank bank;
	int accountNo;
	float balance;
	int depositCounter = 0;
	int withdrawCounter = 0;
	public Customer(String name, Bank bank, int accountNo) {
		super();
		this.name = name;
		this.bank = bank;
		this.accountNo = accountNo;
		this.balance = 1000;
	}
	
	public void addBalance(float money) {
		if(depositCounter < 3) {
			balance += money;
			depositCounter++;
		}else {
			balance = (float)(money*.15)+money+balance;
		}
		
	}
	
	public void withdrawBalance(float money) {
		if(balance-money > 1000 && withdrawCounter<3) {
			balance  = balance - money;
			withdrawCounter++;
		if(withdrawCounter>=3 && (balance - (money*.25)-money)>1000) {
			balance = (float) (balance - (money*.25)-money);
		}
		}
		else {
			System.out.println("you are bankrupt SORRY!!!!!!!!!!!!!");
			withdrawCounter++;
		}
	}
	
	public void checkBalance() {
		System.out.println("your balance is:"+this.balance);
	}

}
