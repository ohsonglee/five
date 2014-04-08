package javapro.bank;

public class BonusPointAccount extends Account{
	int bonusPoint;

	public BonusPointAccount(String accountNo, String onwnerName, int balance,
			int bonusPoint) {
		super(accountNo, onwnerName, balance);
		this.bonusPoint = bonusPoint;
	}

	public void deposit(int amount) {
		super.deposit(amount);
		bonusPoint += (int) amount * 0.001;
	}
	
	
	

}
