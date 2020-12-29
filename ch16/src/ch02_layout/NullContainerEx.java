package ch02_layout;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

//flow layout-���帧�� ���� ��ġ�ǵ��� ����
public class NullContainerEx extends JFrame{
	public NullContainerEx() {
		setTitle("Null Container  ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//�����̳� ���
		Container c = getContentPane();
		
		c.setLayout(null);//��ġ������ ���� 
		//������Ʈ ����
		JLabel la = new JLabel("Hello, PressButton");
		la.setLocation(130,50);
		la.setSize(200,20);
		//�����̳ʿ� ���̱�
		c.add(la);
		
		for(int i=1;i<=9;i++) {
			JButton b = new JButton(Integer.toString(i));
			b.setLocation(i*15, i*15);
			b.setSize(50,20);
			c.add(b);
		}
		
		setSize(new Dimension(300, 200));
		setVisible(true);
	}
		
	public static void main(String[] args) {
		new NullContainerEx();
	}

}
