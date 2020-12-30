package ch04_event;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class IndependentClassListenerEx extends JFrame{
public IndependentClassListenerEx() throws HeadlessException {
	setTitle("Action 이벤트 리스너 예제");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container c = getContentPane();
	c.setLayout(new FlowLayout());
	JButton btn = new JButton("Action");
	
	//리스너 추가
	btn.addActionListener(new MyActionListener());
	c.add(btn);
	
 setSize(350, 150);
 setVisible(true);
	
	}

public static void main(String[] args) {
	new IndependentClassListenerEx();
}
}
class MyActionListener implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
	  JButton b = (JButton)e.getSource();
	  if(b.getText().equals("Action")) 
		  b.setText("액션");
	  else
		  b.setText("Action");
	}
	
}

