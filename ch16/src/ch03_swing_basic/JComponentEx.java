package ch03_swing_basic;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JComponentEx extends JFrame{
	public JComponentEx() throws HeadlessException {
		setTitle("JComponent�� ���� �޼ҵ� ");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton b1 = new JButton("Magenta/Yellow Button");
		JButton b2 = new JButton(" Disabled Button ");
		JButton b3 = new JButton(" getX(),  getY()");
		
		b1.setBackground(Color.YELLOW);
		b1.setForeground(Color.magenta);
		b1.setFont(new Font("Arial",Font.ITALIC,20));//Arial, italic, 20px
		
		b2.setEnabled(false);//��Ȱ��ȭ
	/*
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton) e.getSource();//�̺�Ʈ�� �߻��� ������Ʈ
				JComponentEx frame=(JComponentEx)b.getTopLevelAncestor();//�ֻ��� �θ�
				frame.setTitle(b.getX()+","+b.getY());
			}
		});
		*/
		b3.addActionListener(e->{
				JButton b = (JButton) e.getSource();//�̺�Ʈ�� �߻��� ������Ʈ
				JComponentEx frame=(JComponentEx)b.getTopLevelAncestor();//�ֻ��� �θ�
				frame.setTitle(b.getX()+","+b.getY());
		});
		
		//�����̳ʿ� ��ư ����
		c.add(b1); c.add(b2); c.add(b3);
		setSize(260,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JComponentEx();
	}

}
