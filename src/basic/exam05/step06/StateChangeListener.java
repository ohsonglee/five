package basic.exam05.step06;

import java.util.EventListener;

import basic.exam05.ex02.StateChangeEvent;

//Event Listener
// - 이벤트 처리 규칙을 표시하는 용.
// - 메서드가 없다. 태깅용.
// - 즉 이 인터페이스는 이벤트에 규칙을 정의한다는 사실을 표시. //extends EventListener 그 자체로는 특별한 의미가 없음.
//
// 인터페이스
// - 모든 메서드는 추상메서드인다. 하위 클래스에서 반드시 구현해야 한다.
//  문법) public abstract 리턴타입 메서드명(파라미터 선언...);
//            public abstract 를 생략할 수 있다. (기본값 public)
//
// - 모든 변수는 상수이다.
//  문법 ) public static final 타입 변수 = 값;
public interface StateChangeListener extends EventListener{ 
  /*public abstract */ void stateChanged(StateChangeEvent e);
  
  
}
