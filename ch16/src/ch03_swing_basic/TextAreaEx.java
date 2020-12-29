package ch03_swing_basic;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class TextAreaEx extends JFrame{
	    private JTextField tf=new JTextField(20);
	    private JTextArea ta = new JTextArea(7,20);
	
		public TextAreaEx() throws HeadlessException {
		  setTitle("텍스트영역 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("입력 후 <Enter키>를 입력하세요."));
		c.add(tf);
		c.add(new JScrollPane(ta));
		
		//이벤트리스너
		tf.addActionListener(e-> {
			 JTextField t = (JTextField)e.getSource();
			ta.append(t.getText()+"\n");
			t.setText("");//텍스트 필드 초기화
		});
		
		setSize(300,300);
		setVisible(true);
		
	}

	public static void main(String[] args) {
	 new TextAreaEx();
}
}
