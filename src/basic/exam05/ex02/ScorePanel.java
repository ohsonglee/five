package basic.exam05.ex02;

import java.awt.Button;


@SuppressWarnings("serial")
public class ScorePanel extends ContentPanel {
	public ScorePanel(StudentMgtSystem parent) { 
		//StudentMgtSystem parent :
		//[frame0,55,24,400x300,invalid,hidden,layout=java.awt.CardLayout,title=학생관리시스템,resizable,normal]
		super(parent, "점수관리"); //ContentPanel 에게 전달.
	//	public ContentPanel(StudentMgtSystem parent, String title)
		content.add(new Button("점수관리에 뭔가 넣고 싶다!"));
		
	}
}









