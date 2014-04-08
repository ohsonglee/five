package javapro.bank;

abstract class Account { //계좌
	String accountNo;
	 String onwnerName;
	 int balance;
	 
	 public Account(String accountNo, String onwnerName, int balance) {
		super();
		this.accountNo = accountNo;
		this.onwnerName = onwnerName;
		this.balance = balance;
	}

	public void deposit(int amount){
		 balance += amount;
	 }
	 
	 public int withdraw(int amount) throws Exception{
		 if(balance <amount)
			 throw new Exception("잔액이 부족합니다.");
		 balance -= amount;
		 return  amount;
	 }

}
