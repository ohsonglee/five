package basic.exam05.ex01;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class ContentPanel extends Panel implements ActionListener{
	// protected : 패키지가 달라도 sub 클래스라면 접근 가능
	protected Label title = new Label();
	protected Button btnBack = new Button("뒤로");
	protected Panel content = new Panel();
	//StateChangeListener인퍼페이스에 저장된 객체만 담을 수 있도록 제너릭으로 만듬.
	protected ArrayList<StateChangeListener> listener = new ArrayList<StateChangeListener>(); 
	
	public ContentPanel(String title) {
		this.setLayout(new BorderLayout());
		
		this.title.setText(title);
		
		Panel titlebar = new Panel();
		titlebar.add(this.title);
		titlebar.add(btnBack);
		this.add(titlebar, BorderLayout.NORTH);
		
		this.add(content, BorderLayout.CENTER);
		
		btnBack.addActionListener(this);
	}

  public void actionPerformed(ActionEvent e) {
		fireEvent(new StateChangeEvent( this, "Back"));
	  
  }
	
	public void addStateChangeListener(StateChangeListener l){
		listener.add(l);
	}
	public void removeStateChangeListener(StateChangeListener l){
		listener.remove(l);
	}

	public void fireEvent(StateChangeEvent e){
		for(StateChangeListener l : listener ){
			l.stateChanged(e);
		}
	}
	
}














