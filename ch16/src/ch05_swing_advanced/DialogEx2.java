package ch05_swing_advanced;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.HeadlessException;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class DialogEx2 extends JFrame {
  	public DialogEx2() throws HeadlessException {
  		setTitle("�ɼ� �� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		setSize(500,200);
		c.add(new MyPanel(),	BorderLayout.NORTH);
		setVisible(true);

	}

	public static void main(String[] args) {
	  new DialogEx2();
	}
}

class MyPanel extends Panel{
	private JButton inputBtn = new JButton("Input Name");
	private JTextField tf = new JTextField(10);
	private JButton confirmBtn = new JButton("Confirm");
	private JButton messageBtn = new JButton("Message");
	//������
	public MyPanel() {
		setBackground(Color.LIGHT_GRAY);
		add(inputBtn);
		add(confirmBtn);
		add(messageBtn);
		add(tf);
        
		inputBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String name=JOptionPane.showInputDialog("�̸��� �Է��ϼ���");
				if(name!=null) tf.setText(name);
			}
		});
		
		confirmBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
	         int result = JOptionPane.showConfirmDialog(null, "����ұ��?","Confirm",JOptionPane.YES_NO_OPTION);
	         if(result==JOptionPane.CLOSED_OPTION)
	        	 tf.setText("���þ��� �ݱ�");
	         else if(result==JOptionPane.YES_OPTION)
	        	 tf.setText("��");
	         else
	        	 tf.setText("�ƴϿ�");
			}
		});
		
		messageBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "�����Ҳ���","Message",JOptionPane.ERROR_MESSAGE);
			}
		});
	}

}