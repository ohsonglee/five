package javapro.message;

abstract class MessageSender {
		String title;
		String senderName;
		
		MessageSender(String title, String senderName) {
			this.title = title;
			this.senderName = senderName;
		}
		
		abstract void sendMessage(String recipient);
}
/*
 * 추상메소드를 선언한는 목적
 * 1) 서브클래스에서 이 메소드를 반드시 구현하도록 만들기 위해서
 *   - 슈퍼클래스를 상속받는 서브 클래스가 슈퍼클래스의 추상메소드를 오버라이딩 하지 않으면
 *   - 컴파일에러가 발생한다. 서브클래스에 추상클래스로 만들던지, 서브클래스 안에서 상속받은 추상메서드를 오버라이딩 해야한다. 
 *   - 추상메소드를 선언해두면 그로 인해 서브클래스들이 지켜야할 규칙이 공식적으로 만들어지는 셈이된다.
 * 2) 다형성
 *  - 슈퍼클래스의 메소드를 호출하는 척하면서 컴파일러의 체크를 무사히 통과하고,
 *  - 프로그램이 실행될때는 서브 클래스의 메소드가 호출되도록 하는것이 추상메소드의 또다른 사용목적! 
 * 
 */

