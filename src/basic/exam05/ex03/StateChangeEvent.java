package basic.exam05.ex03;

import java.util.EventObject;


public class StateChangeEvent extends EventObject{
    private static final long serialVersionUID = 1L;
	String stateName;
	
	public StateChangeEvent(Object source) {
	    super(source);
    }
	public StateChangeEvent(Object source, String stateName) {
	    super(source);
	    this.stateName = stateName;
    }

}










