package basic.exam05.ex01;

import java.util.EventObject;
/*<이벤트호출시 이벤트정보를 저장하는 클래스?>
 *   개념
 *   1) 기본생성자: 개발자가 만들지 않으면 컴파일러가 만들어 준다. 
 *   2) 생성자에서 super 클래스의 생성자를 지정하지 않으면, 수퍼의 기본 생성자 호출
 *   3) java.io.Serializable 구현 클래스는 가능한 데이터 버전 정보를 가져야한다. 
 *     -(조상) 부모 클래스가 버전정보를 구현하면 모든 자식클래스는 자동으로 적용된다. 
 *   4) Overloading : 같은 기능을 하는 메서드에 대해 같은 이름을 부여
 *      				=> 프로그래밍에 일관성 부여 (편의성을 위해서)
 *   5) 상속 :수퍼클래스의 속성과 메소드를 물려받는다. 기존코드 재사용
 */
public class StateChangeEvent extends EventObject {
    private static final long serialVersionUID = 1L;

    public String stateName;
    
	public StateChangeEvent(Object source) {
	    super(source);
    }
	public StateChangeEvent(Object source, String stateName) {
	    super(source);
	    this.stateName = stateName;
    }

}

