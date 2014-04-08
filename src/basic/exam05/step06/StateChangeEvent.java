package basic.exam05.step06;

import java.util.EventObject;

public class StateChangeEvent extends EventObject {
    private static final long serialVersionUID = 1L;
	//EventObject는 기본생성자가 없다.
	/*	public StateChangeEvent() {
		super(); 
	}*/

    public String stateName;
    
	public StateChangeEvent(Object source) {
	    super(source);
    } 
	
	public StateChangeEvent(Object source, String stateName) {
	    super(source);
	    this.stateName = stateName;
	    System.out.println(stateName);
	} 

	
}
