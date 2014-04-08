package basic.exam05.ex01;

import java.util.EventListener;
//이벤트 호출시 수행할 메소드
public interface StateChangeListener extends EventListener {
	/*public abstract*/ void stateChanged(StateChangeEvent e);
}
