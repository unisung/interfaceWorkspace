package ch02_layout;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

//flow layout-���帧�� ���� ��ġ�ǵ��� ����
public class FlowLayoutEx extends JFrame{
	public FlowLayoutEx() {
		setTitle("FlowLayout ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//�����̳� ���
		Container c = getContentPane();
		
		//��ġ������ ����
		c.setLayout(new FlowLayout(FlowLayout.LEFT,30,40));//����, ����30px, ����40px
		c.add(new JButton("add"));
		c.add(new JButton("sub"));
		c.add(new JButton("mul"));
		c.add(new JButton("div"));
		c.add(new JButton("Calculate"));
		
		setSize(new Dimension(300, 200));
		setVisible(true);
	}
		
	public static void main(String[] args) {
		new FlowLayoutEx();
	}

}
