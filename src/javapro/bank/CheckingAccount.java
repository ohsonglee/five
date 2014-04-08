package javapro.bank;

public class CheckingAccount extends Account {
	String cardNo;

	public CheckingAccount(	String accountNo, String onwnerName, int balance, String cardNo) {
		super(accountNo, onwnerName, balance);
		this.cardNo = cardNo;
	}
	public int pay(String accountNo, int amount)throws Exception {
		if(!cardNo.equals(this.cardNo) || (balance < amount))
			throw new Exception("지불이 불가능합니다. ");
			return withdraw(amount);
	}
}