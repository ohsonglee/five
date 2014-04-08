package basic.exam05.ex02;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class ContentPanel extends Panel implements ActionListener{
	// protected : 패키지가 달라도 sub 클래스라면 접근 가능
	protected StudentMgtSystem parent;
	protected Label title = new Label();
	protected Button btnBack = new Button("뒤로");
	protected Panel content = new Panel();
	
	public ContentPanel(StudentMgtSystem parent, String title) {
		this.setLayout(new BorderLayout());
		//	 ScorePanel 에서	super(parent : Frame의 정보, "점수관리": title); 
		this.parent = parent;
		System.out.println(this.parent);
		this.title.setText(title);
		System.out.println(this.title);
		Panel titlebar = new Panel();
		titlebar.add(this.title);
		titlebar.add(btnBack);
		this.add(titlebar, BorderLayout.NORTH);
		
		this.add(content, BorderLayout.CENTER);
		
		btnBack.addActionListener(this);
		//basic.exam05.ex02.StudentPanel[panel0,0,0,0x0,invalid,layout=java.awt.BorderLayout]
		//basic.exam05.ex02.ScorePanel[panel1,0,0,0x0,invalid,layout=java.awt.BorderLayout]
		System.out.println(this);
	}

  public void actionPerformed(ActionEvent e) {
	  parent.changePanel(StudentMgtSystem.MENU_PANEL);
	  
  }
	
}














