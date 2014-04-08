package javapro.message;

public class InheritanceExample {

	public static void main(String[] args) {
		EMailSender obj = new EMailSender("생일을 축하합니다.","고객센터","m-_-mzzz@hanmail.net","10%할인크폰이 발행되었습니다.");
		SMSSender obj2 = new SMSSender("생일을 축하드립니다.!!!^*^","오송이","010-2777-2777","10%할인쿠폰발행!");
		
		obj.sendMessage("o0oking@nate.com");
		obj.sendMessage("fivesonglee@gmail.com");
		obj2.sendMessage("mQQQQ@nate.com");

	}

}