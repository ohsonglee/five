package basic.exam05.step03;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
/*
		WindowListener를 구현하기가 불편해서 이렇게 미리 구현한 클래스를 만듦.
		WindowListener를 만들고 싶으면 이 클래스를 상속받아 구현하면 편하다.
		
	*추상클래스
		- 일반클래스는 상속받을 필요가 없이 바로 인스턴스를 생성할 수 있는데 여기서는
		 => MywindowListener 는 직접 사용하기 위해 정의한 클래스가 아니다. 
		 => 하위클래스에게 자신이 구현한 기능을 상속해주기 위해 존재하는 클래스
		 - 추상 클래스는 직접 인스턴스를 생성하지 못하게 막는 문법(추상클래스 그자체는 쓰이지 않는다.)
		 => 하위클래스에게 공통의 속성이나 기능을 상속해주는 용도로 만든 클래스.
		 
		 
		 
*/
public abstract class MyWindowListener implements WindowListener {

	public void windowOpened(WindowEvent e) {}
	public void windowClosing(WindowEvent e) {}
	public void windowClosed(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowActivated(WindowEvent e) {}
	public void windowDeactivated(WindowEvent e) {}

}
