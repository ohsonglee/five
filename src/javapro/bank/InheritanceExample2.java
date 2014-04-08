package javapro.bank;

public class InheritanceExample2 {
	public static void main(String[] args) {
		CreditLineAccount obj = new CreditLineAccount("123-22-456789","Deiv",10000,100000);
		try{
			int amount = obj.withdraw(50000);
			System.out.println("인출액:" + amount);
			System.out.println("잔액:" + obj.balance);
			System.out.println("마이너스한도:" + obj.creditLine);

		}catch(Exception e){
			System.out.println(e.getMessage());
			
		}
	}

}
