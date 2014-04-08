package basic.exam05.ex02;

import java.util.EventObject;

public class StateChangeEvent extends EventObject {

    private static final long serialVersionUID = 1L;
	String stateName; //StudentPanel/scorePanel/menuPanel
	
	public StateChangeEvent(Object source) { //Object source: 이벤트정보
	    super(source);
    }
	public StateChangeEvent(Object source, String stateName) { //Object source: 이벤트정보, 
	    super(source);
	    this.stateName = stateName; //StateChangeEvent 의 StudentPanel/scorePanel/menuPanel
    }
}
