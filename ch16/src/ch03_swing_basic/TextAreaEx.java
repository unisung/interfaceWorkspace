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
		  setTitle("�ؽ�Ʈ���� ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("�Է� �� <EnterŰ>�� �Է��ϼ���."));
		c.add(tf);
		c.add(new JScrollPane(ta));
		
		//�̺�Ʈ������
		tf.addActionListener(e-> {
			 JTextField t = (JTextField)e.getSource();
			ta.append(t.getText()+"\n");
			t.setText("");//�ؽ�Ʈ �ʵ� �ʱ�ȭ
		});
		
		setSize(300,300);
		setVisible(true);
		
	}

	public static void main(String[] args) {
	 new TextAreaEx();
}
}
