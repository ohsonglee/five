package javapro.bank;

public class InheritanceExample3 {

	public static void main(String[] args) {
	 BonusPointAccount obj = new BonusPointAccount("111-2222-444444","김말순",400000, 0);
  obj.deposit(500000);
  System.out.println("잔액:" + obj.balance);
  System.out.println("누적액:" + obj.bonusPoint);

	}

}
