package javapro.bank;

public class CreditLineAccount extends Account {
	int creditLine;

	public CreditLineAccount(String accountNo, String onwnerName, int balance,
			int creditLine) {
		super(accountNo, onwnerName, balance);
		this.creditLine = creditLine;
	}

	public int withdraw(int amount) throws Exception {
		 if((balance + creditLine) < amount )
			 throw new Exception ("인출이 불가능합니다.");
		 		balance = balance - amount;
		 		creditLine += balance;
		return amount;
	}
	

	
	
}
